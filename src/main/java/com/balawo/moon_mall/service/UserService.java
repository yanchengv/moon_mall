package com.balawo.moon_mall.service;

import com.balawo.moon_mall.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    User getById(Long id);

    PageInfo<User> getAllUsers(Integer page, Integer limit);
}
