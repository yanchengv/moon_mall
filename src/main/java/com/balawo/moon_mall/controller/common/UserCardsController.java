package com.balawo.moon_mall.controller.common;

import com.balawo.moon_mall.model.common.UserCard;
import com.balawo.moon_mall.service.UserCardService;
import com.balawo.moon_mall.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCardsController {
    @Autowired
    private UserCardService userCardService;

    @RequestMapping(value = "/common/user_cards/getUserAllCards",method = RequestMethod.GET)
    public JsonResult getAllCardsByUserId(@RequestParam(value = "userId", defaultValue = "10") Long userId) {
        List<UserCard> userCards = userCardService.getAllUserCardsByUserId(userId);
        return JsonResult.success(userCards);
    }
}
