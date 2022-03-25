package com.balawo.moon_mall.service.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutOrderFoodTaste;

import java.util.List;

public interface TakeoutOrderFoodTasteService {

    List<TakeoutOrderFoodTaste> getOrderFoodTasteByTFoodId(long order_food_id);

    String getOrderFoodTasteNameByfoodId(long order_food_id);
}
