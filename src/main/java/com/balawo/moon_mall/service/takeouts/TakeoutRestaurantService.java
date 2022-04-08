package com.balawo.moon_mall.service.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutRestaurant;
import com.github.pagehelper.PageInfo;

public interface TakeoutRestaurantService {

    TakeoutRestaurant  getRestaurantInfoById(long id);
    PageInfo<TakeoutRestaurant> getRestaurantList(Integer page , Integer limit);
    Boolean updateRestaurant( TakeoutRestaurant takeoutRestaurant);
}
