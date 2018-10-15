package com.jnshu.carrots.backstageservice.model;

public class JobTwoWithBLOBs extends JobTwo {
    private String jobCaption;

    private String jobRequirement;

    private String jobWelfare;

    public String getJobCaption() {
        return jobCaption;
    }

    public void setJobCaption(String jobCaption) {
        this.jobCaption = jobCaption == null ? null : jobCaption.trim();
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement == null ? null : jobRequirement.trim();
    }

    public String getJobWelfare() {
        return jobWelfare;
    }

    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare == null ? null : jobWelfare.trim();
    }
}