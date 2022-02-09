package com.one.doc.dao;

import com.one.doc.entity.Document;
import com.one.doc.entity.DocumentExample;
import java.util.List;

public interface DocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectByExample(DocumentExample example);

    Document selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}