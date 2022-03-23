package com.balawo.moon_mall.service;

import com.balawo.moon_mall.model.takeout.TakeoutOrder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.Map;


public interface TakeoutOrderService {

    Map getTakeoutOrderById(long id);
    PageInfo<TakeoutOrder> getAllTakeoutOrders(Integer page , Integer limit);
}
