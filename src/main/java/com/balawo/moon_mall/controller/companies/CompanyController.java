package com.balawo.moon_mall.controller.companies;

import cn.hutool.core.bean.BeanUtil;
import com.balawo.moon_mall.model.company.Company;
import com.balawo.moon_mall.model.company.Department;
import com.balawo.moon_mall.model.vo.company.CompanyVo;
import com.balawo.moon_mall.model.vo.company.DepartmentVo;
import com.balawo.moon_mall.service.company.CompanyService;
import com.balawo.moon_mall.service.company.DepartmentService;
import com.balawo.moon_mall.utils.JsonResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/companies/")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private DepartmentService departmentService;




    @RequestMapping("index")
    public JsonResult<List<CompanyVo>> getCompanyList(){
        List<CompanyVo> companyVos = new ArrayList<>();
        List<Company> companies = companyService.getCompanyList();
        for(Company c : companies){
            CompanyVo cvo = new CompanyVo();
            BeanUtils.copyProperties(c, cvo);
            companyVos.add(cvo);
        }
        return JsonResult.success(companyVos);
    }

    @RequestMapping("get_departments_by_company")
    public JsonResult<List<DepartmentVo>> getDepartmentListByCompany(@RequestParam(value = "companyId") Integer companyId){
        List<DepartmentVo> departmentVos = new ArrayList<>();
        List<Department> departmentList = departmentService.getDeptListByCompanyId(companyId);
        for(Department d : departmentList){
            DepartmentVo departmentVo = new DepartmentVo();
            BeanUtils.copyProperties(d,departmentVo);
            departmentVos.add(departmentVo);
        }
        return JsonResult.success(departmentVos);
    }


}
