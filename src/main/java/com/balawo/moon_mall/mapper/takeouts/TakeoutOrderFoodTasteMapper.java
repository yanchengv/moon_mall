package com.balawo.moon_mall.mapper.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutOrderFoodTaste;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakeoutOrderFoodTasteMapper {
    public List<TakeoutOrderFoodTaste> getOrderFoodTasteByTFoodId(long order_food_id);
}
