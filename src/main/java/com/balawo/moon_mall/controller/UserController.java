package com.balawo.moon_mall.controller;

import com.balawo.moon_mall.model.User;
import com.balawo.moon_mall.model.common.UserCard;
import com.balawo.moon_mall.service.UserCardService;
import com.balawo.moon_mall.service.UserService;
import com.balawo.moon_mall.utils.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserCardService userCardService;

    @RequestMapping("/users/getAllUsers")
    public JsonResult<PageInfo<User>> getAllUsers(@RequestParam(name = "page", defaultValue = "1") Integer page, @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        PageInfo<User> userLists = userService.getAllUsers(page, pageSize);
        return JsonResult.success(userLists);
    }

    @RequestMapping(value = "/users/getUserDetails", method = RequestMethod.GET)
    public JsonResult<Map<String, String>> getUserDetails(@RequestParam(name = "id", defaultValue = "") Long id) {
        User user = userService.getById(id);
        List<UserCard> userCards = userCardService.getAllUserCardsByUserId(id);
        Map userMap = new HashMap();
        userMap.put("id", user.getId());
        userMap.put("name", user.getName());
        userMap.put("nickname", user.getNickname());
        userMap.put("createdAt", user.getCreatedAt());
        userMap.put("email", user.getEmail());
        userMap.put("status", User.Status.get(user.getStatus()));

        List cardList = new ArrayList();
        for (UserCard uc : userCards) {
            HashMap m = new HashMap();
            m.put("id", uc.getId());
            m.put("card_no", uc.getCardNo());
            m.put("realname",uc.getRealname());
            m.put("card_type",uc.getCardType());
            m.put("card_level",uc.getCardLevel());
            m.put("id_type",uc.getIdType());
            m.put("id_number",uc.getIdNumber());
            m.put("lvyun_card_id",uc.getLvyunCardId());
            m.put("lvyun_member_id",uc.getLvyunMemberID());
            m.put("mobile",uc.getMobile());
            m.put("is_supplement_card",uc.getIsSupplementCard());
            m.put("lvyun_mem_created_at",uc.getMemCreatedAt());
            m.put("created_at",uc.getCreatedAt());
            cardList.add(m);
        }
        userMap.put("userCards", cardList);
        return JsonResult.success(userMap);
    }


}
