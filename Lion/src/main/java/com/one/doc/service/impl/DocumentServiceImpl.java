package com.one.doc.service.impl;

import com.one.doc.dao.DocumentMapper;
import com.one.doc.entity.Document;
import com.one.doc.entity.DocumentExample;
import com.one.doc.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentMapper documentMapper;

    @Override
    public List<Document> list() {
        DocumentExample example =new DocumentExample();
        example.setOrderByClause("id desc");
        return documentMapper.selectByExample(example);
    }

    @Override
    public void add(Document document) {

        int beginVersionId = 1;
//        String operatorName = "admin";

        Document lastDocument = documentMapper.getLastDocument();
        int lastDocumentId = lastDocument.getId();

        // 设置需要自动生成的属性
        document.setDocumentId(lastDocumentId+1); //上传文件document id每次加1
        document.setVersionId(beginVersionId); // 首次上传版本version id总为1
//        document.setOperator_name("admin"); //先默认设置为管理员
        document.setOperateType("upload"); // 上传操作
        document.setOperateTime(new Date());  //设置文件操作时间

        documentMapper.insert(document);
    }

    @Override
    public void delete(int id) {
        documentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Document get(int id) {
        return documentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Document document) {
        int lastVersionId = document.getVersionId();
        document.setVersionId(lastVersionId + 1);
        documentMapper.updateByPrimaryKeySelective(document);
    }

}
