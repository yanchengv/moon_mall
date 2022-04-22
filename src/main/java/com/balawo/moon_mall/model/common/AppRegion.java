package com.balawo.moon_mall.model.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppRegion {
    public static Map<Integer,String> regionCode;
    static {
        regionCode = new HashMap();
        regionCode.put(1,"阿那亚北戴河");
        regionCode.put(2,"阿那亚广州");
        regionCode.put(3,"阿那亚三亚");
        regionCode.put(4,"阿那亚金山岭");
        regionCode.put(5,"阿那亚雾灵山");
        regionCode.put(6,"阿那亚象山海岸");
    }

    public static List getAppRegionMapList(){
        List list = new ArrayList<HashMap<String,String>>();
        for(Integer key : AppRegion.regionCode.keySet()){
            String v = AppRegion.regionCode.get(key);
            HashMap<String,String>  hm = new HashMap();
            hm.put("id",key.toString());
            hm.put("value",v);
            list.add(hm);
        }
        return list;
    }





}
