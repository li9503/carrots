package com.jnshu.carrots.serviceadmin.dao;


public class Article {
    long[] createAtAr = {1537367472203L, 1537337972203L, 1537377972203L, 1537367982203L};
    String[] createNameAr = {"丁一", "王二", "张三", "李四"};
    long[] updateAtAr = {1537367872203L, 1537338972203L, 1537378972203L, 1537387982203L};
    String[] updateNameAr = {"丁一", "王二", "张三", "李四"};
    String[] imageNameAr = {"图一", "图二", "图三", "图四"};
    String[] imageUrlAr = {"http://pdotd3prr.bkt.clouddn.com/3656123lkhnk123413143.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1761849473,2141928749&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1055377080,246995825&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3322897985,2079873898&fm=26&gp=0.jpg"};
    String[] imageCaptionAr = {"", "", "", ""};
    String[] imageJumpUrlAr = {"", "", "", ""};
    int[] imageStatusAr = {0, 1};
    int[] imageTypeAr = {0, 1, 2, 3};
    int[] imageTradeAr = {0, 1, 2, 3, 4, 5, 6};
    int imageId;
    String imageName;
    int imageTime;
    int imageType;
    long createAt;
    long updateAt;
    String createName;
    String imageUrl;
    int imageStatus;
    String imageCaption;
    String imageJumpUrl;
    int imageTrade;
    String updateName;




    public Article(  String imageName,  int imageType, long createAt, long updateAt,  int imageStatus) {
        this.imageId=1;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.imageName = imageName;
        this.imageStatus = imageStatus;
        this.imageType = imageType;
    }
public Article(String imageName ,int imageTime,int imageType,String imageCaption,String imageJumpUrl,int imageTrade,String imageUrl,int imageStatus){
    this.imageName = imageName;
    this.imageUrl = imageUrl;
    this.imageStatus = imageStatus;
    this.imageType = imageType;
    this.imageTime= imageTime;
    this.imageCaption = imageCaption;
    this.imageJumpUrl = imageJumpUrl;
    this.imageTrade = imageTrade;
}
    public Article(int num) {
        int i = num % 4;
        this.createAt = createAtAr[i];
        this.createName = createNameAr[i];
        this.updateAt = updateAtAr[i];
        this.updateName = updateNameAr[i];
        this.imageId = num;
        this.imageName = imageNameAr[i];
        this.imageUrl = imageUrlAr[i];
        this.imageStatus = imageStatusAr[num % 2];
        this.imageType = imageTypeAr[i];
        this.imageTime = 3;
        this.imageCaption = imageCaptionAr[i];
        this.imageJumpUrl = imageJumpUrlAr[i];
        this.imageTrade = imageTradeAr[num % 7];
    }

    public long getCreateAt() {
        return createAt;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public int getId() {
        return imageId;
    }

    public void setId(int id) {
        this.imageId = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(int imageStatus) {
        this.imageStatus = imageStatus;
    }

    public int getImageType() {
        return imageType;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    public int getImageTime() {
        return imageTime;
    }

    public void setImageTime(int imageTime) {
        this.imageTime = imageTime;
    }

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption;
    }

    public String getImageJumpUrl() {
        return imageJumpUrl;
    }

    public void setImageJumpUrl(String imageJumpUrl) {
        this.imageJumpUrl = imageJumpUrl;
    }

    public int getImageTrade() {
        return imageTrade;
    }

    public void setImageTrade(int imageTrade) {
        this.imageTrade = imageTrade;
    }
}
