package com.jnshu.carrots.backstageservice.model;

public class CompanyOne {
    private Long companyId;

    private String companyName;

    private String companyLogo;

    private String companyTrade;

    private String companyTag;

    private Integer companyAut;

    private String companyPeople;

    private Integer companyStatus;

    private String createName;

    private Long createTime;

    private String updateName;

    private Long updateAt;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(String companyTrade) {
        this.companyTrade = companyTrade == null ? null : companyTrade.trim();
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag == null ? null : companyTag.trim();
    }

    public Integer getCompanyAut() {
        return companyAut;
    }

    public void setCompanyAut(Integer companyAut) {
        this.companyAut = companyAut;
    }

    public String getCompanyPeople() {
        return companyPeople;
    }

    public void setCompanyPeople(String companyPeople) {
        this.companyPeople = companyPeople == null ? null : companyPeople.trim();
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}