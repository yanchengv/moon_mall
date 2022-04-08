package com.balawo.moon_mall.mapper.companies;

import com.balawo.moon_mall.model.company.Department;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentMapper {

    @Results(id = "deptListMapper",value = {
            @Result(column = "id",property = "id",id=true),
            @Result(column = "company_id",property = "companyId"),
            @Result(column = "name",property = "name"),
            @Result(column = "status",property = "status"),
            @Result(column = "created_at",property = "createdAt")
    })
    @Select("select * from departments where company_id=#{companyId} and deleted_at is null order by id asc")
    public List<Department> getDeptListByCompanyId(long companyId);
}
