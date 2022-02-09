package com.one.doc.entity;

import java.util.Date;

public class Document {
    private Integer id;

    private Integer document_id;

    private Integer version_id;

    private String history_document_id;

    private String document_name;

    private String document_secret_level;

    private String document_release_number;

    private Date document_release_time;

    private String operator_name;

    private Date operate_time;

    private String operate_remarks;

    private String operate_type;

    private String category_value_1;

    private String category_value_2;

    private String category_value_3;

    private String document_text;

    private String picture_link;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public Integer getVersion_id() {
        return version_id;
    }

    public void setVersion_id(Integer version_id) {
        this.version_id = version_id;
    }

    public String getHistory_document_id() {
        return history_document_id;
    }

    public void setHistory_document_id(String history_document_id) {
        this.history_document_id = history_document_id == null ? null : history_document_id.trim();
    }

    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name == null ? null : document_name.trim();
    }

    public String getDocument_secret_level() {
        return document_secret_level;
    }

    public void setDocument_secret_level(String document_secret_level) {
        this.document_secret_level = document_secret_level == null ? null : document_secret_level.trim();
    }

    public String getDocument_release_number() {
        return document_release_number;
    }

    public void setDocument_release_number(String document_release_number) {
        this.document_release_number = document_release_number == null ? null : document_release_number.trim();
    }

    public Date getDocument_release_time() {
        return document_release_time;
    }

    public void setDocument_release_time(Date document_release_time) {
        this.document_release_time = document_release_time;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name == null ? null : operator_name.trim();
    }

    public Date getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(Date operate_time) {
        this.operate_time = operate_time;
    }

    public String getOperate_remarks() {
        return operate_remarks;
    }

    public void setOperate_remarks(String operate_remarks) {
        this.operate_remarks = operate_remarks == null ? null : operate_remarks.trim();
    }

    public String getOperate_type() {
        return operate_type;
    }

    public void setOperate_type(String operate_type) {
        this.operate_type = operate_type == null ? null : operate_type.trim();
    }

    public String getCategory_value_1() {
        return category_value_1;
    }

    public void setCategory_value_1(String category_value_1) {
        this.category_value_1 = category_value_1 == null ? null : category_value_1.trim();
    }

    public String getCategory_value_2() {
        return category_value_2;
    }

    public void setCategory_value_2(String category_value_2) {
        this.category_value_2 = category_value_2 == null ? null : category_value_2.trim();
    }

    public String getCategory_value_3() {
        return category_value_3;
    }

    public void setCategory_value_3(String category_value_3) {
        this.category_value_3 = category_value_3 == null ? null : category_value_3.trim();
    }

    public String getDocument_text() {
        return document_text;
    }

    public void setDocument_text(String document_text) {
        this.document_text = document_text == null ? null : document_text.trim();
    }

    public String getPicture_link() {
        return picture_link;
    }

    public void setPicture_link(String picture_link) {
        this.picture_link = picture_link == null ? null : picture_link.trim();
    }
}