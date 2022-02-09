package com.one.doc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.one.doc.entity.Document;
import com.one.doc.service.DocumentService;

public class DocumentController {
    @Autowired
    DocumentService documentService;

    @RequestMapping("document_add")
    public String add(Document document){
        documentService.add(document);
        return "redirect:/admin_category_list"; // Todo:待修改
    }
}
