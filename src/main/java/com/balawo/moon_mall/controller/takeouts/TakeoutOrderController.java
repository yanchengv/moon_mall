package com.balawo.moon_mall.controller.takeouts;

import com.balawo.moon_mall.model.takeout.TakeoutOrder;
import com.balawo.moon_mall.service.TakeoutOrderService;
import com.balawo.moon_mall.utils.JsonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/takeouts/orders/")
public class TakeoutOrderController {

    @Autowired
    private TakeoutOrderService orderService;


    @RequestMapping(value = "show",method = RequestMethod.GET)
    public JsonResult<Map<String,String>> getTakeoutOrderInfo(@RequestParam(value = "orderId",defaultValue = "0") long userId){
        Map to = orderService.getTakeoutOrderById(userId);
        return JsonResult.success(to);
    }

    @RequestMapping("index")
    public JsonResult<PageInfo<TakeoutOrder>> getAllOrders(@RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(value = "limit",defaultValue = "30") Integer limit){
        PageInfo<TakeoutOrder> orders = orderService.getAllTakeoutOrders(page,limit);
        return JsonResult.success(orders);
    }






}
