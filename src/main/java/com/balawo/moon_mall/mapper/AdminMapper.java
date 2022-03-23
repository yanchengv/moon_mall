package com.balawo.moon_mall.mapper;

import com.balawo.moon_mall.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface AdminMapper {
    //@Select("select * from admins where id = #{id}")
    public Admin getAdminInfoById(Long id);

    public List<Admin> getAllAdmins();


    public int updateAdmin(HashMap admin);
}
