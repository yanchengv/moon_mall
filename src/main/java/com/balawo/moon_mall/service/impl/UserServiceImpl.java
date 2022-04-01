package com.balawo.moon_mall.service.impl;

import com.balawo.moon_mall.mapper.UserMapper;
import com.balawo.moon_mall.model.User;
import com.balawo.moon_mall.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
       User user =  userMapper.getUserInfoById(id);
        return user;
    }

    @Override
    public PageInfo<User> getAllUsers(Integer page, Integer limit) {
        // 1. 开启分页
        PageHelper.startPage(page,limit);
        // 2. 从数据库中查询出
        List<User> userList = userMapper.getAllUsers();
        //用PageInfo对结果进行包装，把list到PageInfo对象中自动分页
        PageInfo<User> userPages = new PageInfo(userList);

        return userPages;
    }
}
