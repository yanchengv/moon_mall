package com.balawo.moon_mall.mapper.companies;

import com.balawo.moon_mall.model.company.Company;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyMapper {

    @Results(id="companyMap",value = {
            @Result(column = "id",property = "id",id=true),
            @Result(column = "name",property = "name"),
            @Result(column = "status",property = "status"),
            @Result(column = "created_at",property = "createdAt"),
            @Result(column = "id",property = "departmentList",
            many = @Many(select = "com.balawo.moon_mall.mapper.companies.DepartmentMapper.getDeptListByCompanyId"))
    })
    @Select("select * from companies where deleted_at is null order by id asc")
    public List<Company> getAllCompanyList();
}
