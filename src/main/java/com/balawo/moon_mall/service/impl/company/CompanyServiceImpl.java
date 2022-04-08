package com.balawo.moon_mall.service.impl.company;

import com.balawo.moon_mall.mapper.companies.CompanyMapper;
import com.balawo.moon_mall.model.company.Company;
import com.balawo.moon_mall.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> getCompanyList() {
       List<Company>  companyList = companyMapper.getAllCompanyList();
        return companyList;
    }
}
