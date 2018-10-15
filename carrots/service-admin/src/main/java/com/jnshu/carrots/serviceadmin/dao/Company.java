package com.jnshu.carrots.serviceadmin.dao;

/**
 * @author 李景磊
 */
public class Company {
    String[] companyNameAr = {"阿里巴巴", "京东", "腾讯", "百度"};
    String[] companyLogoAr = {"http://pdotd3prr.bkt.clouddn.com/3656123lkhnk123413143.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1761849473,2141928749&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1055377080,246995825&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3322897985,2079873898&fm=26&gp=0.jpg"};
    int[] companyStatusAr = {0, 1};
    int[] companyTypeAr = {0, 1, 2, 3};
    int[] companyTradeAr = {0, 1, 2, 3, 4, 5, 6};

    int[] companyAutAr = {0, 1};
    String[] companyTagAr = {"五险一金", "双休", "996", "带薪年假"};
    int[] companyPeopleAr = {100, 200, 500, 1000, 10000};
    String[] companyAreaAr = {"北京", "上海", "广州", "深圳"};
    String[] companySloganAr = {"铸造辉煌，唯有质量。", "优质产品，是市场竞争必胜的保证。", "品质—企业致胜的关键。", "21世纪——质量领先者的世纪。"};
    int[] companySizeAr = {0, 1, 2, 3, 4, 5, 6};
    String[] companyProductNameAr = {"淘宝网", "抹茶", "毒奶粉", "贴吧"};
    String[] companyProductLogoAr = {"http://pdotd3prr.bkt.clouddn.com/2421341631jnbjknol.jpg", "http://pdotd3prr.bkt.clouddn.com/u=4028059692,301053396&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3040256635,1677190081&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3383116446,3982237106&fm=11&gp=0.jpg"};
    String[] companyProductSloganAr = {"淘宝网", "抹茶", "毒奶粉", "贴吧"};
    String[] companyProductCaptionAr = {"", "", "", ""};
    String[] companyPhoneAr = {"15219958581", "13429031059", "145368562155", "16583275614"};
    String[] companyEmailAr = {"54156416416@qq.com", "5416541651@jnshu.com", "541654163@gmail.com", "sfbsfj@ptteng.com"};
    String[] companyAddrAr = {"长安街一号", "华盛顿大道一号", "克里姆林宫1号", "爱丽舍宫二号"};
    String[] companyMapAr = {"", "", "", ""};

    long createAt;
    String createName;
    long updateAt;
    String updateName;
    int companyId;
    String companyName;
    String companyLogo;
    int companyTrade;
    int companyAut;
    String companyTag;
    int companyPeople;
    int companyStatus;
    String companyArea;
    String companySlogan;
    int companySize;
    String companyProductName;
    String companyProductLogo;
    String companyProductSlogan;
    String companyProductCaption;
    String companyPhone;
    String companyEmail;
    String companyAddr;
    String companyMap;
    String companyCaption;


    /**
     * 搜索
     *
     * @param companyName
     * @param companyStatus
     */
    public Company(String companyName, int companyTrade, String companyProductName, int companyAut, int companyStatus, int companySize, String companyArea) {
        this.companyId = 1;
        this.companyName = companyName;
        this.companyTrade = companyTrade;
        this.companyProductName = companyProductName;
        this.companyAut = companyAut;
        this.companyStatus = companyStatus;
        this.companySize = companySize;
        this.companyArea = companyArea;
    }

    /**
     * 新增/修改
     *
     * @param companyName
     * @param companyStatus
     */
    public Company(String companyName, String companyLogo, int companyTrade, int companyAut, String companyTag, int companyPeople, int companyStatus, String companyArea, String companySlogan, int companySize, String companyProductName, String companyProductLogo, String companyProductSlogan, String companyProductCaption, String companyPhone, String companyEmail, String companyAddr, String companyMap, String companyCaption) {
        this.companyName = companyName;
        this.companyLogo = companyLogo;
        this.companyTrade = companyTrade;
        this.companyAut = companyAut;
        this.companyTag = companyTag;
        this.companyPeople = companyPeople;
        this.companyStatus = companyStatus;
        this.companyArea = companyArea;
        this.companySlogan = companySlogan;
        this.companySize = companySize;
        this.companyProductName = companyProductName;
        this.companyProductLogo = companyProductLogo;
        this.companyProductSlogan = companyProductSlogan;
        this.companyProductCaption = companyProductCaption;
        this.companyPhone = companyPhone;
        this.companyEmail = companyEmail;
        this.companyAddr = companyAddr;
        this.companyMap = companyMap;
        this.companyCaption = companyCaption;
    }
    /**
     * 查询列表
     *
     * @param num
     */
    public Company(Integer num) {
        int i = num % 4;
        this.companyId = num;
        this.companySize = companySizeAr[num % 7];
        this.companyStatus = companyStatusAr[num % 2];
        this.companyTrade = companyTradeAr[num % 7];
        this.companyAut = companyAutAr[num % 2];
        this.companyName = companyNameAr[i];
        this.companyArea = companyAreaAr[i];
    }

    /**
     * 查询单条
     *
     * @param num
     */
    public Company(int num) {
        int i = num % 4;
        this.companyId = num;
        this.companySize = companySizeAr[num % 7];
        this.companyPeople = companyPeopleAr[num % 5];
        this.companyStatus = companyStatusAr[num % 2];
        this.companyTrade = companyTradeAr[num % 7];
        this.companyAut = companyAutAr[num % 2];
        this.companyName = companyNameAr[i];
        this.companyLogo = companyLogoAr[i];
        this.companyTag = companyTagAr[i] + "," + companyTagAr[(num + 1) % 4];
        this.companyArea = companyAreaAr[i];
        this.companySlogan = companySloganAr[i];
        this.companyProductName = companyProductNameAr[i];
        this.companyProductLogo = companyProductLogoAr[i];
        this.companyProductSlogan = companyProductSloganAr[i];
        this.companyProductCaption = companyProductCaptionAr[i];
        this.companyPhone = companyPhoneAr[i];
        this.companyEmail = companyEmailAr[i];
        this.companyAddr = companyAddrAr[i];
        this.companyMap = companyMapAr[i];
    }

    public String getCompanyCaption() {
        return companyCaption;
    }

    public void setCompanyCaption(String companyCaption) {
        this.companyCaption = companyCaption;
    }


    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public int getCompanyPeople() {
        return companyPeople;
    }

    public void setCompanyPeople(int companyPeople) {
        this.companyPeople = companyPeople;
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan;
    }

    public int getCompanySize() {
        return companySize;
    }

    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    public String getCompanyProductName() {
        return companyProductName;
    }

    public void setCompanyProductName(String companyProductName) {
        this.companyProductName = companyProductName;
    }

    public String getCompanyProductLogo() {
        return companyProductLogo;
    }

    public void setCompanyProductLogo(String companyProductLogo) {
        this.companyProductLogo = companyProductLogo;
    }

    public String getCompanyProductSlogan() {
        return companyProductSlogan;
    }

    public void setCompanyProductSlogan(String companyProductSlogan) {
        this.companyProductSlogan = companyProductSlogan;
    }

    public String getCompanyProductCaption() {
        return companyProductCaption;
    }

    public void setCompanyProductCaption(String companyProductCaption) {
        this.companyProductCaption = companyProductCaption;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getCompanyMap() {
        return companyMap;
    }

    public void setCompanyMap(String companyMap) {
        this.companyMap = companyMap;
    }


    public long getCreateAt() {
        return createAt;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(int companyStatus) {
        this.companyStatus = companyStatus;
    }


    public int getCompanyAut() {
        return companyAut;
    }

    public void setCompanyAut(int companyAut) {
        this.companyAut = companyAut;
    }

    public int getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(int companyTrade) {
        this.companyTrade = companyTrade;
    }
}

