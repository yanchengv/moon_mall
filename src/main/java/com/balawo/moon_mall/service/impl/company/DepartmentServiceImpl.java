package com.balawo.moon_mall.service.impl.company;

import com.balawo.moon_mall.mapper.companies.DepartmentMapper;
import com.balawo.moon_mall.model.company.Department;
import com.balawo.moon_mall.service.company.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDeptListByCompanyId(long companyId) {
        List<Department> departmentList = departmentMapper.getDeptListByCompanyId(companyId);
        return departmentList;
    }

    @Override
    public Department getDeptInfoById(long department_id) {
       Department department =  departmentMapper.getDeptInfoById(department_id);
        return department;
    }
}
