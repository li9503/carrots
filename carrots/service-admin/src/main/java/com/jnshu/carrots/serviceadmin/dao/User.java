package com.jnshu.carrots.serviceadmin.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:45
 * @Param
 * @return
 */
public class User {
    long[] createAtAr = {1537367472203L, 1537337972203L, 1537377972203L, 1537367982203L};
    String[] createNameAr = {"丁一", "王二", "张三", "李四"};
    long[] updateAtAr = {1537367872203L, 1537338972203L, 1537378972203L, 1537387982203L};
    String[] updateNameAr = {"丁一", "王二", "张三", "李四"};
//    String[] userNameAr = {"信息管理", "模块二", "模块三", "模块四"};
//    String[] userUrlAr = {"http://pdotd3prr.bkt.clouddn.com/3656123lkhnk123413143.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1761849473,2141928749&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=1055377080,246995825&fm=26&gp=0.jpg", "http://pdotd3prr.bkt.clouddn.com/u=3322897985,2079873898&fm=26&gp=0.jpg"};
//    String[] userCaptionAr = {"", "", "", ""};
//    String[] userJumpUrlAr = {"", "", "", ""};
//    int[] userStatusAr = {0, 1};
//    int[] userTypeAr = {0, 1, 2, 3};
//    int[] userTradeAr = {0, 1, 2, 3, 4, 5, 6};


    int userId;
    String userName;
    String userRole;
    String userPhone;
    String userPassword;
    String updateName;
    long createAt;
    long updateAt;
    String createName;
    int roleId;
//
//    public User(int num) {
//        int i = num % 4;
//        this.createAt = createAtAr[i];
//        this.createName = createNameAr[i];
//        this.updateAt = updateAtAr[i];
//        this.updateName = updateNameAr[i];
//        this.userId = num;
//        this.userName =;
//        this.userParent = num;
//        this.userUrl = RandomData.getRandomString(2) + "." + RandomData.getRandomString(2);
//        this.userType = userTypeAr[num % 4];
//    }

    public User() {
    }

    /**
     * 新增/修改
     */
    public User(int userId, String userName, String userRole, String userPhone, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.updateName = updateNameAr[userId % 4];
        this.createAt = createAtAr[userId % 4];
        this.updateAt = updateAtAr[userId % 4];
        this.createName = createNameAr[userId % 4];
        this.roleId = userId;
    }

    public User(int userId, String userName, int roleId, String userPhone, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.updateName = updateNameAr[userId % 4];
        this.createAt = createAtAr[userId % 4];
        this.updateAt = updateAtAr[userId % 4];
        this.createName = createNameAr[userId % 4];
        this.roleId = roleId;
    }
    public static List userList() {
        User user1 = new User(1, "丁钻石", "钻石管理员", "", "123456");
        User user2 = new User(2, "王铂金", "铂金管理员", "", "123456");
        User user3 = new User(3, "张黄金", "黄金管理员", "", "123456");
        User user4 = new User(4, "李白银", "白银管理员", "", "123456");
        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return list;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int userRoleId) {
        this.roleId = userRoleId;
    }
}
