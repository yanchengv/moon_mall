package com.balawo.moon_mall.controller;

import com.balawo.moon_mall.model.Admin;
import com.balawo.moon_mall.service.AdminService;
import com.balawo.moon_mall.utils.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {


    @Autowired
    private AdminService adminService;



    @RequestMapping("/admins/getAllAdmins")
    public JsonResult<PageInfo<Admin>> getAdminsList(@RequestParam(name = "page", defaultValue = "1") Integer page, @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        PageInfo<Admin> responseData = adminService.getAllAdmins(page, pageSize);
        return JsonResult.success(responseData);
    }

    @RequestMapping("/admins/update")
    public JsonResult<Map<String,String>> updateAdmin(@RequestBody HashMap params){
        //return JsonResult.success();
       HashMap m =  new HashMap();
       m.put("id",params.get("id"));
       m.put("name",params.get("name"));
       m.put("nickname",params.get("nickname"));
       adminService.update(params);
        return JsonResult.success(m);
    }


    @RequestMapping(value = "/admins/details",method= RequestMethod.GET)
    public JsonResult<Map<String,String>> getAdminInfo(@RequestParam(name="id",defaultValue = "") Long id){
        if(id == null){
            return JsonResult.failed("主键ID不能为空");
        }
        Admin admin = adminService.getById(id);
        HashMap m = new HashMap();
        m.put("id",admin.getId());
        m.put("name",admin.getName());
        m.put("nickname",admin.getNickname());
        m.put("email",admin.getEmail());
        m.put("createdAt",admin.getCreatedAt());
        return JsonResult.success(m);
    }


}
