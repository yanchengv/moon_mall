package com.balawo.moon_mall.service;

import com.balawo.moon_mall.model.Admin;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface AdminService {

    Admin getById(Long id);

    PageInfo<Admin> getAllAdmins(Integer page, Integer limit);

    int update(HashMap admin);


}
