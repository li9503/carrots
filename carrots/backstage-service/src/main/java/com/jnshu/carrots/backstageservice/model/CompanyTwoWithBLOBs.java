package com.jnshu.carrots.backstageservice.model;

public class CompanyTwoWithBLOBs extends CompanyTwo {
    private String companyCaption;

    private String companyProductCaption;

    public String getCompanyCaption() {
        return companyCaption;
    }

    public void setCompanyCaption(String companyCaption) {
        this.companyCaption = companyCaption == null ? null : companyCaption.trim();
    }

    public String getCompanyProductCaption() {
        return companyProductCaption;
    }

    public void setCompanyProductCaption(String companyProductCaption) {
        this.companyProductCaption = companyProductCaption == null ? null : companyProductCaption.trim();
    }
}