package com.balawo.moon_mall.service;


import com.balawo.moon_mall.model.common.UserCard;

import java.util.List;

public interface UserCardService {

    List<UserCard> getAllUserCardsByUserId(Long userId);
}
