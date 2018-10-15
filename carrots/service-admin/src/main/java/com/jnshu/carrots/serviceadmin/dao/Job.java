package com.jnshu.carrots.serviceadmin.dao;

/**
 * @author ljl
 */
public class Job {
    String[] jobNameAr = {"java工程师", "web工程师", "产品经理", "UI工程师"};
    String[] jobCompanyAr = {"阿里巴巴", "京东", "腾讯", "百度"};
    int[] jobSalaryAr = {0, 1, 2, 3};
    int[] jobPriorityAr = {0, 1};
    int[] jobTypeAr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] jobLevelAr = {0, 1, 2, 3, 4};
    int[] jobStatusAr = {0, 1};
    int[] jobExpAr = {0, 1, 2, 3, 4};
    int[] jobEducationAr = {0, 1, 2, 3};
    String[] jobTagAr = {"五险一金", "双休", "996", "带薪年假"};
    String[] jobWelfareAr = {"五险一金", "双休", "996", "带薪年假"};
    String[] jobCaptionAr = {"北京", "上海", "广州", "深圳"};
    String[] jobRequirementAr = {"铸造辉煌，唯有质量。", "优质产品，是市场竞争必胜的保证。", "品质—企业致胜的关键。", "21世纪——质量领先者的世纪。"};
    long[] updateAtAr = {1537367872203L, 1537338972203L, 1537378972203L, 1537387982203L};

    long updateAt;
    int jobId;
    String jobName;
    String jobCompany;
    int jobSalary;
    int jobPriority;
    int jobType;
    int jobLevel;
    int jobStatus;
    int jobExp;
    int jobEducation;
    String jobTag;
    String jobWelfare;
    String jobCaption;
    String jobRequirement;

    /**
     * 搜索
     *
     * @param jobName
     * @param jobStatus
     */
    public Job(String jobCompany,  String jobName,  int jobType,  int jobEducation, int jobExp, int jobSalary, int jobStatus,long updateAt) {
        this.jobCompany=jobCompany;
        this.jobName=jobName;
        this.jobType=jobType;
        this.jobEducation=jobEducation;
        this.jobExp=jobExp;
        this.jobSalary=jobSalary;
        this.jobStatus=jobStatus;
        this.updateAt=updateAt;
    }

    /**
     * 新增/修改
     *
     * @param jobName
     * @param jobStatus
     */
    public Job(String jobName, String jobCompany, int jobSalary, int jobPriority, int jobType, int jobLevel, int jobStatus, int jobExp, int jobEducation, String jobTag, String jobWelfare, String jobCaption, String jobRequirement) {
       this.jobName= jobName;
       this.jobCompany= jobCompany;
       this.jobSalary= jobSalary;
       this.jobPriority= jobPriority;
       this.jobType= jobType;
       this.jobLevel= jobLevel;
       this.jobStatus= jobStatus;
       this.jobExp= jobExp;
       this.jobEducation= jobEducation;
       this.jobTag= jobTag;
       this.jobWelfare= jobWelfare;
       this.jobCaption= jobCaption;
       this.jobRequirement= jobRequirement;
    }

    /**
     * 查询列表
     *
     * @param num
     */
    public Job(Integer num) {
        int i = num % 4;
        this.jobId = num;
        this.jobCompany=jobCompanyAr[i];
        this.jobName=jobNameAr[i];
        this.jobType=jobTypeAr[num%11];
        this.jobEducation=jobEducationAr[i];
        this.jobExp=jobExpAr[num%5];
        this.jobSalary=jobSalaryAr[i];
        this.jobStatus=jobStatusAr[num%2];
        this.updateAt=updateAtAr[i];
    }

    /**
     * 查询单条
     *
     * @param num
     */
    public Job(int num) {
        int i = num % 4;
        this.jobId = num;
        this.jobName=jobNameAr[i];
        this.jobCompany=jobCompanyAr[i];
        this.jobSalary=jobSalaryAr[i];
        this.jobPriority= jobPriorityAr[num%2];
        this.jobType=jobTypeAr[num%11];
        this.jobLevel= jobLevelAr[num%5];
        this.jobStatus=jobStatusAr[num%2];
        this.jobExp=jobExpAr[num%5];
        this.jobEducation=jobEducationAr[i];
        this.jobTag= jobTagAr[i];
        this.jobWelfare= jobWelfareAr[i];
        this.jobCaption= jobCaptionAr[i];
        this.jobRequirement= jobRequirementAr[i];
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

    public int getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(int jobSalary) {
        this.jobSalary = jobSalary;
    }

    public int getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(int jobPriority) {
        this.jobPriority = jobPriority;
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public int getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(int jobStatus) {
        this.jobStatus = jobStatus;
    }

    public int getJobExp() {
        return jobExp;
    }

    public void setJobExp(int jobExp) {
        this.jobExp = jobExp;
    }

    public int getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(int jobEducation) {
        this.jobEducation = jobEducation;
    }

    public String getJobTag() {
        return jobTag;
    }

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    public String getJobWelfare() {
        return jobWelfare;
    }

    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare;
    }

    public String getJobCaption() {
        return jobCaption;
    }

    public void setJobCaption(String jobCaption) {
        this.jobCaption = jobCaption;
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }
}


