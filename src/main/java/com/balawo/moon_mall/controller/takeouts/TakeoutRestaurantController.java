package com.balawo.moon_mall.controller.takeouts;


import cn.hutool.core.date.DateUtil;
import com.balawo.moon_mall.model.common.AppRegion;
import com.balawo.moon_mall.model.company.Department;
import com.balawo.moon_mall.model.takeout.TakeoutRestaurant;
import com.balawo.moon_mall.model.vo.takeout.TakeoutRestaurantVo;
import com.balawo.moon_mall.service.company.DepartmentService;
import com.balawo.moon_mall.service.takeouts.TakeoutRestaurantService;
import com.balawo.moon_mall.utils.JsonResult;
import com.balawo.moon_mall.utils.MyUtils;
import com.balawo.moon_mall.utils.Pagination;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/takeouts/restaurants/")
public class TakeoutRestaurantController {

    @Autowired
    private TakeoutRestaurantService takeoutRestaurantService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("index")
    public JsonResult<Pagination<TakeoutRestaurantVo>> index(@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "limit",defaultValue = "10") Integer limit){
        PageInfo restaurantPageInfo = takeoutRestaurantService.getRestaurantList(page,limit);
        List<TakeoutRestaurant> resList = restaurantPageInfo.getList();
        List<TakeoutRestaurantVo> rVoList = new ArrayList<>();
        for(TakeoutRestaurant r: resList){
            TakeoutRestaurantVo rvo = new TakeoutRestaurantVo();
            BeanUtils.copyProperties(r,rvo);
            rvo.setStatusZh(TakeoutRestaurant.Status.get((int)r.getStatus()));
            rvo.setRegionCode(MyUtils.RegionCode.get(r.getRegionCode()));
            rvo.setCreatedAt(DateUtil.format(r.getCreatedAt(),"yyyy-MM-dd HH:mm:ss"));
            rVoList.add(rvo);
        }
        restaurantPageInfo.setList(rVoList);
        Pagination<TakeoutRestaurantVo> my = Pagination.initPage(restaurantPageInfo);
        return JsonResult.success(my);
    }

    @RequestMapping("show")
    public JsonResult<TakeoutRestaurantVo> show (long id){
        TakeoutRestaurantVo tro = new TakeoutRestaurantVo();
        TakeoutRestaurant trs = takeoutRestaurantService.getRestaurantInfoById(id);
        BeanUtils.copyProperties(trs,tro);
        if(tro.getDepartmentId() != 0){
            Department department = departmentService.getDeptInfoById(tro.getDepartmentId());
            tro.setCompanyId(department.getCompanyId());
        }

        tro.setAppRegionList(AppRegion.getAppRegionMapList());
        return JsonResult.success(tro);
    }

    @PostMapping(value = "update",produces = "application/json;charset=UTF-8")
    public JsonResult update(@RequestBody TakeoutRestaurantVo trvo){
        TakeoutRestaurant tr = new TakeoutRestaurant();
        BeanUtils.copyProperties(trvo,tr);
        tr.setId(trvo.getId());
        takeoutRestaurantService.updateRestaurant(tr);
        return JsonResult.success(trvo);
    }

}
