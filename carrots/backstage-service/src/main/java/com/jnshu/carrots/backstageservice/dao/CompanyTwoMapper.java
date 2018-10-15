package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.CompanyTwo;
import com.jnshu.carrots.backstageservice.model.CompanyTwoWithBLOBs;

public interface CompanyTwoMapper {
    int deleteByPrimaryKey(Long companyId);

    int insert(CompanyTwoWithBLOBs record);

    int insertSelective(CompanyTwoWithBLOBs record);

    CompanyTwoWithBLOBs selectByPrimaryKey(Long companyId);

    int updateByPrimaryKeySelective(CompanyTwoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyTwoWithBLOBs record);

    int updateByPrimaryKey(CompanyTwo record);
}