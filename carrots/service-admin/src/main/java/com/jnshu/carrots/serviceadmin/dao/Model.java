package com.jnshu.carrots.serviceadmin.dao;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/28 0:27
 * @Param
 * @return
 */
public class Model {

    long[] createAtAr = {1537367472203L, 1537337972203L, 1537377972203L, 1537367982203L};
    String[] createNameAr = {"丁一", "王二", "张三", "李四"};
    long[] updateAtAr = {1537367872203L, 1537338972203L, 1537378972203L, 1537387982203L};
    String[] updateNameAr = {"丁一", "王二", "张三", "李四"};
//    String[] modelNameAr = {"信息管理", "模块二", "模块三", "模块四"};
//    String[] modelUrlAr = {"http://pdotd3prr.bkt.clouddn.com/3656123lkhnk123413143.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1761849473,2141928749&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1055377080,246995825&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3322897985,2079873898&fm=26&gp=0.jpg"};
//    String[] modelCaptionAr = {"", "", "", ""};
//    String[] modelJumpUrlAr = {"", "", "", ""};
//    int[] modelStatusAr = {0, 1};
//    int[] modelTypeAr = {0, 1, 2, 3};
//    int[] modelTradeAr = {0, 1, 2, 3, 4, 5, 6};


    int modelId;
    String modelName;
    String modelMenuId;
    String modelUrl;
    int modelParent;
    String modelType;
    String updateName;
    long createAt;
    long updateAt;
    String createName;
//
//    public Model(int num) {
//        int i = num % 4;
//        this.createAt = createAtAr[i];
//        this.createName = createNameAr[i];
//        this.updateAt = updateAtAr[i];
//        this.updateName = updateNameAr[i];
//        this.modelId = num;
//        this.modelName =;
//        this.modelParent = num;
//        this.modelUrl = RandomData.getRandomString(2) + "." + RandomData.getRandomString(2);
//        this.modelType = modelTypeAr[num % 4];
//    }


    /**
     * 新增/修改
     */
    public Model(int modelId, String modelName,String modelMenuId, String modelUrl, int modelParent, String modelType) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelUrl = modelUrl;
        this.modelParent = modelParent;
        this.modelType = modelType;
        this.updateName = updateNameAr[modelId % 4];
        this.createAt = createAtAr[modelId % 4];
        this.updateAt = updateAtAr[modelId % 4];
        this.createName = createNameAr[modelId % 4];
        this.modelMenuId=modelMenuId;
    }


    public static List modelList() {
        Model model1 = new Model(1, "信息管理", "Info","", 1024, "测试");
        Model model2 = new Model(2, "公司信息", "Company","home.company", 1, "测试");
        Model model3 = new Model(3, "职位信息", "Job","home.job", 1, "测试");
        Model model4 = new Model(4, "内容管理", "Content","", 1024, "测试");
        Model model5 = new Model(5, "Article管理", "Article","home.article", 4, "测试");
        Model model6 = new Model(6, "后台管理", "Backstage","", 1024, "测试");
        Model model7 = new Model(7, "账号管理", "User","home.account", 6, "测试");
        Model model8 = new Model(8, "角色管理", "Role","home.role", 6, "测试");
        Model model9 = new Model(9, "修改密码", "Psw","home.password", 6, "测试");
        Model model10 = new Model(10, "模块管理", "Model","home.module", 6, "测试");
        List list = new ArrayList();
        list.add(model1);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        list.add(model5);
        list.add(model6);
        list.add(model7);
        list.add(model8);
        list.add(model9);
        list.add(model10);
        return list;
    }

    public Model(String modelName,String modelMenuId ){
        this.modelName = modelName;
        this.modelMenuId=modelMenuId;
    }


    public static List modelListSimple() {
        Model model1 = new Model("信息管理", "Info");
        Model model2 = new Model("公司信息", "Company");
        Model model3 = new Model("职位信息", "Job");
        Model model4 = new Model("内容管理", "Content");
        Model model5 = new Model("Article管理", "Article");
        Model model6 = new Model("后台管理", "Backstage");
        Model model7 = new Model("账号管理", "User");
        Model model8 = new Model("角色管理", "Role");
        Model model9 = new Model("修改密码", "Psw");
        Model model10 = new Model("模块管理", "Model");
        List list = new ArrayList();
        list.add(model1);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        list.add(model5);
        list.add(model6);
        list.add(model7);
        list.add(model8);
        list.add(model9);
        list.add(model10);
        return list;
    }
//    /**
//     * 查询列表
//     *
//     * @param num
//     */
//    public Model(Integer num) {
//        int i = num % 4;
//        this.modelId = num;
//        this.modelCompany = modelCompanyAr[i];
//        this.modelName = modelNameAr[i];
//        this.modelType = modelTypeAr[num % 11];
//        this.modelEducation = modelEducationAr[i];
//        this.modelExp = modelExpAr[num % 5];
//        this.modelSalary = modelSalaryAr[i];
//        this.modelStatus = modelStatusAr[num % 2];
//        this.updateAt = updateAtAr[i];
//    }
//
//    /**
//     * 查询单条
//     *
//     * @param num
//     */
//    public Model(int num) {
//        int i = num % 4;
//        this.modelId = num;
//        this.modelName = modelNameAr[i];
//        this.modelCompany = modelCompanyAr[i];
//        this.modelSalary = modelSalaryAr[i];
//        this.modelPriority = modelPriorityAr[num % 2];
//        this.modelType = modelTypeAr[num % 11];
//        this.modelLevel = modelLevelAr[num % 5];
//        this.modelStatus = modelStatusAr[num % 2];
//        this.modelExp = modelExpAr[num % 5];
//        this.modelEducation = modelEducationAr[i];
//        this.modelTag = modelTagAr[i];
//        this.modelWelfare = modelWelfareAr[i];
//        this.modelCaption = modelCaptionAr[i];
//        this.modelRequirement = modelRequirementAr[i];
//    }


    public String getModelMenuId() {
        return modelMenuId;
    }

    public void setModelMenuId(String modelMenuId) {
        this.modelMenuId = modelMenuId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelUrl() {
        return modelUrl;
    }

    public void setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
    }

    public int getModelParent() {
        return modelParent;
    }

    public void setModelParent(int modelParent) {
        this.modelParent = modelParent;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

}
