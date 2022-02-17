package com.one.doc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.one.doc.entity.Document;
import com.one.doc.service.DocumentService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DocumentController {
    @Autowired
    DocumentService documentService;


    @RequestMapping("/main")
    public String main(){
        return "example/main";}

    @RequestMapping(value= "/main/list")
    public String list(Model model){
        List<Document> ds= documentService.list();
        model.addAttribute("ds", ds);
        return "example/list";
    }

    @RequestMapping("/main/upload")
    public String upload(){
        return "example/upload";}

    @RequestMapping(value= "/main/upload/document_add", method = RequestMethod.POST)
    public String add(Document document){
        documentService.add(document);
        return "redirect:/main"; // 暂时先返回主页面
    }

    @RequestMapping("/main/list/edit")
    public String edit(int id,Model model) throws IOException {
        Document d= documentService.get(id);
        model.addAttribute("d", d);
        return "example/edit";
    }

    @RequestMapping("/main/list/document_delete")
    public String delete(int id) {
        Document d = documentService.get(id);
        documentService.delete(id);
        return "redirect:/main/list";
    }

    @RequestMapping("/main/list/edit/document_update")
    public String update(Document d) throws IOException {
        documentService.update(d);
        return "redirect:/main/list";
    }

//    @RequestMapping("document_edit")
//    public String edit(Model model, int id) {
//        Document d = documentService.get(id);
////        Category c = categoryService.get(p.getCid());
////        p.setCategory(c);
//        model.addAttribute("d", d);
//        return "admin/editProduct";
}
