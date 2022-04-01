package com.balawo.moon_mall.service.impl.takeouts;

import com.balawo.moon_mall.mapper.takeouts.TakeoutRestaurantMapper;
import com.balawo.moon_mall.model.takeout.TakeoutRestaurant;
import com.balawo.moon_mall.service.takeouts.TakeoutRestaurantService;
import com.balawo.moon_mall.utils.Pagination;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakeoutRestaurantServiceImpl implements TakeoutRestaurantService {

    @Autowired
    private TakeoutRestaurantMapper restaurantMapper;

    @Override
    public TakeoutRestaurant getRestaurantInfoById(long id) {
        return null;
    }

    @Override
    public PageInfo<TakeoutRestaurant> getRestaurantList(Integer page, Integer limit) {
        //1.开启分页
        PageHelper.startPage(page, limit);
        //2.从数据库中查询数据
        List<TakeoutRestaurant> restaurants = restaurantMapper.getRestaurantList();
        //3.获取分页信息，用PageInfo对结果进行包装，封装list到PageInfo对象中自动分页
        PageInfo restaurantsPage = new PageInfo(restaurants);

        return restaurantsPage;
    }
}
