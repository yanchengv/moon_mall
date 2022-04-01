package com.balawo.moon_mall.mapper.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutRestaurant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakeoutRestaurantMapper {
    List<TakeoutRestaurant> getRestaurantList();
}
