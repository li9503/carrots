package com.jnshu.carrots.backstageservice.model;

public class Banner {
    private Long imageId;

    private String imageName;

    private String imageUrl;

    private Integer imageStatus;

    private Integer imageType;

    private Integer imageTime;

    private String imageJumpUrl;

    private Integer imageTrade;

    private String createName;

    private Long createTime;

    private String updateName;

    private Long updateAt;

    private String imageCaption;

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(Integer imageStatus) {
        this.imageStatus = imageStatus;
    }

    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    public Integer getImageTime() {
        return imageTime;
    }

    public void setImageTime(Integer imageTime) {
        this.imageTime = imageTime;
    }

    public String getImageJumpUrl() {
        return imageJumpUrl;
    }

    public void setImageJumpUrl(String imageJumpUrl) {
        this.imageJumpUrl = imageJumpUrl == null ? null : imageJumpUrl.trim();
    }

    public Integer getImageTrade() {
        return imageTrade;
    }

    public void setImageTrade(Integer imageTrade) {
        this.imageTrade = imageTrade;
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

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption == null ? null : imageCaption.trim();
    }
}