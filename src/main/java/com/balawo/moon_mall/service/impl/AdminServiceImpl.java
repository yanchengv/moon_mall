package com.balawo.moon_mall.service.impl;

import com.balawo.moon_mall.mapper.AdminMapper;
import com.balawo.moon_mall.model.Admin;
import com.balawo.moon_mall.service.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin getById(Long id) {
        Admin admin = adminMapper.getAdminInfoById(id);
        return admin;
    }

    @Override
    public PageInfo<Admin> getAllAdmins(Integer page, Integer limit) {
        Logger logger = LoggerFactory.getLogger(getClass());
        PageHelper.startPage(page, limit);
        logger.info(String.valueOf(1111));
        List<Admin> adminList = adminMapper.getAllAdmins();
        //用PageInfo对结果进行包装
        PageInfo<Admin> pageInfo = new PageInfo(adminList);

        logger.info(String.valueOf(pageInfo.getTotal()));

        return pageInfo;
    }

    @Override
    public int update(HashMap admin) {
        adminMapper.updateAdmin(admin);
        return 0;
    }
}
