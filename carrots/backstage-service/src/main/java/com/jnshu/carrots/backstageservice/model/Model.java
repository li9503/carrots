package com.jnshu.carrots.backstageservice.model;

public class Model {
    private Long modelId;

    private String modelName;

    private String modelMenuId;

    private String modelUrl;

    private Integer modelParent;

    private String modelType;

    private String createName;

    private Long createTime;

    private String updateName;

    private Long updateAt;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getModelMenuId() {
        return modelMenuId;
    }

    public void setModelMenuId(String modelMenuId) {
        this.modelMenuId = modelMenuId == null ? null : modelMenuId.trim();
    }

    public String getModelUrl() {
        return modelUrl;
    }

    public void setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl == null ? null : modelUrl.trim();
    }

    public Integer getModelParent() {
        return modelParent;
    }

    public void setModelParent(Integer modelParent) {
        this.modelParent = modelParent;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
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