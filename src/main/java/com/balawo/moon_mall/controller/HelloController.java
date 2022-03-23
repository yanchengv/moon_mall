package com.balawo.moon_mall.controller;

import com.balawo.moon_mall.model.Admin;
import com.balawo.moon_mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/hello")
    public String hello(){
        Admin admin = adminService.getById((long)10);
        return "hello"   + admin;
    }
}
