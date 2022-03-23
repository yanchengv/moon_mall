package com.balawo.moon_mall.service.impl;

import com.balawo.moon_mall.mapper.UserCardMapper;
import com.balawo.moon_mall.model.common.UserCard;
import com.balawo.moon_mall.service.UserCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCardServiceImpl implements UserCardService {

    @Autowired
    private UserCardMapper userCardMapper;

    @Override
    public List<UserCard> getAllUserCardsByUserId(Long userId) {
        List<UserCard> userCards = userCardMapper.getAllCardsByUserId(userId);
        return userCards;
    }
}
