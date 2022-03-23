package com.balawo.moon_mall.mapper;

import com.balawo.moon_mall.model.common.UserCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserCardMapper {
    public List<UserCard> getAllCardsByUserId(Long userId);
}
