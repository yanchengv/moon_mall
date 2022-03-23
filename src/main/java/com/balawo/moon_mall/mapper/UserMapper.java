package com.balawo.moon_mall.mapper;

import com.balawo.moon_mall.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    public User getUserInfoById (Long id);
    public List<User> getAllUsers();
}
