package com.jnshu.carrots.backstageservice.model;

public class CompanyTwo {
    private Long companyId;

    private Long companyOneId;

    private String companyArea;

    private String companySlogan;

    private Integer companySize;

    private String companyProductName;

    private String companyProductLogo;

    private String companyProductSlogan;

    private String companyPhone;

    private String companyEmail;

    private String companyAddr;

    private String companyMap;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyOneId() {
        return companyOneId;
    }

    public void setCompanyOneId(Long companyOneId) {
        this.companyOneId = companyOneId;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea == null ? null : companyArea.trim();
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan == null ? null : companySlogan.trim();
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public String getCompanyProductName() {
        return companyProductName;
    }

    public void setCompanyProductName(String companyProductName) {
        this.companyProductName = companyProductName == null ? null : companyProductName.trim();
    }

    public String getCompanyProductLogo() {
        return companyProductLogo;
    }

    public void setCompanyProductLogo(String companyProductLogo) {
        this.companyProductLogo = companyProductLogo == null ? null : companyProductLogo.trim();
    }

    public String getCompanyProductSlogan() {
        return companyProductSlogan;
    }

    public void setCompanyProductSlogan(String companyProductSlogan) {
        this.companyProductSlogan = companyProductSlogan == null ? null : companyProductSlogan.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }

    public String getCompanyMap() {
        return companyMap;
    }

    public void setCompanyMap(String companyMap) {
        this.companyMap = companyMap == null ? null : companyMap.trim();
    }
}