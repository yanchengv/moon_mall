package com.balawo.moon_mall.service.impl.takeouts;

import cn.hutool.core.collection.CollUtil;
import com.balawo.moon_mall.mapper.takeouts.TakeoutOrderFoodTasteMapper;
import com.balawo.moon_mall.model.takeout.TakeoutOrderFoodTaste;
import com.balawo.moon_mall.service.takeouts.TakeoutOrderFoodTasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TakeoutOrderFoodTasteServiceImpl implements TakeoutOrderFoodTasteService {

    @Autowired
    private TakeoutOrderFoodTasteMapper taste;


    @Override
    public List<TakeoutOrderFoodTaste> getOrderFoodTasteByTFoodId(long order_food_id) {
        List<TakeoutOrderFoodTaste> tastes = taste.getOrderFoodTasteByTFoodId(order_food_id);
        return tastes;
    }

    //根据订单餐点ID获取对应的口味名称
    @Override
    public String getOrderFoodTasteNameByfoodId(long order_food_id) {
        List<TakeoutOrderFoodTaste> tastes = taste.getOrderFoodTasteByTFoodId(order_food_id);
        List<String> tasteNamesArr = new ArrayList();
        for(TakeoutOrderFoodTaste t: tastes){
            tasteNamesArr.add(t.getName());
        }
        return CollUtil.join(tasteNamesArr,"、");
    }


}
