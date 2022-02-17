//package com.one.example.controller;
//
//import com.one.example.entity.Staff;
//import com.one.example.entity.StaffRecord;
//import com.one.example.service.StaffService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.Calendar;
//import java.util.Date;
//
//@Controller
//public class RegistController {
//
//    private final StaffService staffService;
//
//    @Autowired
//    public RegistController(StaffService staffService) {
//        this.staffService = staffService;
//    }
//
//    @RequestMapping("/main")
//    public String main(){
//        return "example/main";
//    }
//
//    @RequestMapping("/main/regist")
//    public String regist(){
//        return "example/regist";}
//
//
//    @RequestMapping("/main/staff")
//    public String staff(){
//        return "example/staff";}
//
//    @RequestMapping(value = "main/staff/add",method = RequestMethod.POST)  //请求映射
//    public String add(StaffRecord record){
//        //如果输入姓名为空，则弹出“姓名栏不能为空对话框”
//        Staff staff = new Staff();
//        //姓名
//        staff.setName(record.getStaffName());
//        //密码
//        staff.setPassword(record.getStaffPassword());
//        //0代表用户类型
//        staff.setType(0);
//        //时间
//        Calendar ca = Calendar.getInstance();
//        Date now = ca.getTime();
//        staff.setTime(now);
//        //id
//        staff.setId(now.getTime());
//        staffService.insert(staff);
//        return "example/main";
//    }
//
//    @RequestMapping("/main/upload")
//    public String upload(){
//        return "example/upload";}
//}
