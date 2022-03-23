package com.balawo.moon_mall.mapper.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakeoutOrderMapper {
    public TakeoutOrder getTakeoutOrderById(long id);
    public List<TakeoutOrder> getAllTakeoutOrders();
}
