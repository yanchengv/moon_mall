package com.balawo.moon_mall.service.company;

import com.balawo.moon_mall.model.company.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getDeptListByCompanyId(long CompanyId);

    Department getDeptInfoById(long department_id);
}
