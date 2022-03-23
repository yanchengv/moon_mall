package com.balawo.moon_mall.service.impl;

import cn.hutool.core.date.DateUtil;
import com.balawo.moon_mall.mapper.takeouts.TakeoutOrderMapper;
import com.balawo.moon_mall.model.takeout.TakeoutDeliveryer;
import com.balawo.moon_mall.model.takeout.TakeoutOrder;
import com.balawo.moon_mall.model.takeout.TakeoutOrderFood;
import com.balawo.moon_mall.service.TakeoutOrderService;
import com.balawo.moon_mall.utils.MyUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TakeoutOrderServiceImpl implements TakeoutOrderService {

    @Autowired
    private TakeoutOrderMapper takeoutOrderMapper;

    @Override
    public Map getTakeoutOrderById(long id) {
        TakeoutOrder o = takeoutOrderMapper.getTakeoutOrderById(id);
        Map hm = new HashMap();
        hm.put("id", o.getId());
        hm.put("order_no", o.getOrderNo());
        hm.put("amount", o.getAmount());
        hm.put("status_zh",TakeoutOrder.Status.get((int) o.getStatus()));
        hm.put("delivery_type",TakeoutOrder.DeliveryType.get((int)o.getDeliveryType()));
        if(o.getTakeoutRestaurant() != null){
            hm.put("restaurant_name",o.getTakeoutRestaurant().getName());
        }
        hm.put("pay_type_zh", MyUtils.PayTypes.get((int)o.getPayType()));//支付方式
        hm.put("tableware_count",o.getTablewareCount());//餐具数量
        hm.put("tableware_amount",o.getTablewareAmount());
        hm.put("package_count",o.getPackageCount());//打包盒个数
        hm.put("package_amount",o.getPackageAmount());
        hm.put("pay_at",DateUtil.format(o.getPayAt(),"yyyy-MM-dd HH:mm:ss"));
        hm.put("created_at",DateUtil.format(o.getCreatedAt(),"yyyy-MM-dd HH:mm:ss"));
        hm.put("region_code",MyUtils.RegionCode.get(o.getRegionCode()));
        hm.put("admin_remark",o.getOrderRemark());
        hm.put("user_remark",o.getRemark());

        //订单配送信息
        HashMap delivery_info = new HashMap();
        delivery_info.put("user_id",o.getUserId());
        if(o.getUser() != null){
            delivery_info.put("user_nickname",o.getUser().getNickname());
        }
       if(o.getTakeoutDeliveryer() != null){
           delivery_info.put("deliveryer_id",o.getDeliveryerId());
           delivery_info.put("deliveryer_name",o.getTakeoutDeliveryer().getName());
           delivery_info.put("deliveryer_mobile",o.getTakeoutDeliveryer().getMobile());
           delivery_info.put("deliveryer_type", TakeoutDeliveryer.Typee.get((int)o.getTakeoutDeliveryer().getTypee()));
           delivery_info.put("arrange_deliveryer_at",o.getArrangeDeliveryerAt()); //派送时间
           delivery_info.put("deliveryer_received_order_at",o.getDeliveryerReceivedOrderAt());
           delivery_info.put("meal_finished_at",o.getMealFinishedAt()); //送餐完成时间
       }
        delivery_info.put("user_phone",o.getPhone());
        delivery_info.put("user_realname",o.getRealname());
        delivery_info.put("address",o.getAddress());
        hm.put("delivery_info",delivery_info);
        //订单餐点的信息
        List foodArr = new ArrayList();
        List<TakeoutOrderFood> foods = o.getTakeoutOrderFood();
        for(TakeoutOrderFood f : foods) {
            HashMap fm = new HashMap();
            fm.put("id",f.getId());
            fm.put("name",f.getName());
            fm.put("amount",f.getAmount());
            fm.put("price",f.getPrice());
            fm.put("status",TakeoutOrderFood.Status.get((int)f.getStatus()));
            fm.put("count",f.getCount());
            fm.put("package_amount",f.getPackageCount());
            fm.put("refund_price",f.getRefundPrice());
            fm.put("refund_num",f.getRefundNum());
            fm.put("refund_apply_at",DateUtil.format(f.getRefundApplyAt(),"yyyy-MM-dd HH:mm:ss"));
            foodArr.add(fm);
        }

        hm.put("order_foods", foodArr);
        return hm;
    }

    @Override
    public PageInfo<TakeoutOrder> getAllTakeoutOrders(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<TakeoutOrder> orders = takeoutOrderMapper.getAllTakeoutOrders();
        //获取分页信息，用PageInfo对结果进行包装
        PageInfo<TakeoutOrder> orderPage = new PageInfo(orders);
        //获取分页的list数据
        List<TakeoutOrder> myOrders = orderPage.getList();
        ArrayList orderArr = new ArrayList();
        for (TakeoutOrder order : myOrders) {
            HashMap hm = new HashMap();
            hm.put("id", order.getId());
            hm.put("order_no", order.getOrderNo());
            hm.put("status", order.getStatus());
            hm.put("status_zh", TakeoutOrder.Status.get((int) order.getStatus()));
            hm.put("amount", order.getAmount());
            hm.put("delivery_type", TakeoutOrder.DeliveryType.get((int) order.getDeliveryType()));
            hm.put("realname", order.getRealname());
            hm.put("booking_address", order.getAddress());
            hm.put("created_at", DateUtil.format(order.getCreatedAt(), "yyyy-MM-dd HH:mm:ss"));
            hm.put("restaurant_name", order.getTakeoutRestaurant().getName());
            hm.put("restaurant_id", order.getTakeoutRestaurant().getId());
            if(order.getUser() != null){
                hm.put("u_nickname", order.getUser().getNickname());
            }
            orderArr.add(hm);
        }
        //重新把二次处理的orders数据放入分页对象中
        orderPage.setList(orderArr);
        return orderPage;
    }
}
