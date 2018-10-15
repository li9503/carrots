package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.CompanyOne;

public interface CompanyOneMapper {
    int deleteByPrimaryKey(Long companyId);

    int insert(CompanyOne record);

    int insertSelective(CompanyOne record);

    CompanyOne selectByPrimaryKey(Long companyId);

    int updateByPrimaryKeySelective(CompanyOne record);

    int updateByPrimaryKey(CompanyOne record);
}