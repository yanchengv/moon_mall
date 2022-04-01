package com.balawo.moon_mall.utils;

import java.util.HashMap;
import java.util.Map;

public class MyUtils {
    //支付方式
    public static Map<Integer,String> PayTypes;
    //所属城市
    public static Map<String,String> RegionCode;
    static{

        PayTypes = new HashMap();
        PayTypes.put(1,"支付宝");
        PayTypes.put(2,"微信");
        PayTypes.put(3,"业主卡主卡");
        PayTypes.put(4,"业主卡副卡");
        PayTypes.put(5,"3F返租卡主卡");
        PayTypes.put(6,"3F返租卡副卡");
        PayTypes.put(7,"vvip卡");
        PayTypes.put(8,"员工卡");
        PayTypes.put(9,"安澜实名返租卡主卡");
        PayTypes.put(10,"电子卡");
        PayTypes.put(11,"员工福利卡");
        PayTypes.put(12,"三亚旅游度假卡");
        PayTypes.put(13,"海风电子卡");
        PayTypes.put(14,"地产员工餐卡");
        PayTypes.put(15,"九州会员工餐卡");
        PayTypes.put(16,"DO卡");
        PayTypes.put(17,"安澜实名返租卡副卡");
        PayTypes.put(19,"冬日季畅玩卡");
        PayTypes.put(20,"合作伙伴储值卡");
        PayTypes.put(21,"集团餐卡");
        PayTypes.put(22,"秦皇岛业主卡主卡");
        PayTypes.put(23,"秦皇岛业主卡副卡");
        PayTypes.put(24,"金山岭业主卡主卡");
        PayTypes.put(25,"金山岭业主卡副卡");
        PayTypes.put(26,"九州会员工储值卡");
        PayTypes.put(27,"营销员工储值卡");
        PayTypes.put(28,"地产员工储值卡");
        PayTypes.put(29,"三亚业主卡");
        PayTypes.put(30,"三亚业主卡副卡");


        //1秦皇岛,2广州,3三亚,4金山岭
        RegionCode = new HashMap();
        RegionCode.put("1","北戴河");
        RegionCode.put("2","广州");
        RegionCode.put("3","三亚");
        RegionCode.put("4","金山岭");
    }
}
