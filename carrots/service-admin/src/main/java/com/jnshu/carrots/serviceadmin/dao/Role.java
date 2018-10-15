package com.jnshu.carrots.serviceadmin.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 20:19
 * @Param
 * @return
 */
public class Role {
    long[] createTimeAr = {1537367472203L, 1537337972203L, 1537377972203L, 1537367982203L};
    String[] createNameAr = {"丁一", "王二", "张三", "李四"};
    long[] updateAtAr = {1537367872203L, 1537338972203L, 1537378972203L, 1537387982203L};
    String[] updateNameAr = {"丁一", "王二", "张三", "李四"};


    int roleId;
    String roleName;
    String updateName;
    long createTime;
    long updateAt;
    String createName;
    Map perms;

    /**
     * 新增/修改
     */
    public Role(int roleId, String roleName, Map perms) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.updateName = updateNameAr[roleId % 4];
        this.createTime = createTimeAr[roleId % 4];
        this.updateAt = updateAtAr[roleId % 4];
        this.createName = createNameAr[roleId % 4];
        this.perms = perms;
    }
    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public static List roleListSimple() {
        Role role1 = new Role(1, "钻石管理员" );
        Role role2 = new Role(2, "铂金管理员" );
        Role role3 = new Role(3, "黄金管理员" );
        Role role4 = new Role(4, "白银管理员" );
        List list = new ArrayList();
        list.add(role1);
        list.add(role2);
        list.add(role3);
        list.add(role4);
        return list;
    }

    public static List roleList() {
        Role role1 = new Role(1, "钻石管理员", permMap(1) );
        Role role2 = new Role(2, "铂金管理员",permMap(4) );
        Role role3 = new Role(3, "黄金管理员",permMap(2) );
        Role role4 = new Role(4, "白银管理员",permMap(5) );
        List list = new ArrayList();
        list.add(role1);
        list.add(role2);
        list.add(role3);
        list.add(role4);
        return list;
    }


    static Map permMap(int i) {

        String[] perm1 = {"create", "update", "delete"};
        String[] perm2 = {"update", "delete"};
        String[] perm3 = {"delete"};
        String[] perm4 = {"create", "delete"};
        List perm=new ArrayList();
        perm.add(perm1);
        perm.add(perm2);
        perm.add(perm3);
        perm.add(perm4);
        int[] model={2,3,5,7,8,10};
        Map map1 = new LinkedHashMap();
        for (int j =0;j<=i;j++){
            map1.put(model[j],perm.get(j%4));
        }
        int[] a = {0};
        map1.put("6",a);
        map1.put("1",a);
        map1.put("4",a);
        map1.put("9",a);
        return map1;
    }


    public Map getPerms() {
        return perms;
    }

    public void setPerms(Map perms) {
        this.perms = perms;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
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

    class Perm {

        private Long permId;

        private String permName;

        public Long getPermId() {
            return permId;
        }

        public void setPermId(Long permId) {
            this.permId = permId;
        }

        public String getPermName() {
            return permName;
        }

        public void setPermName(String permName) {
            this.permName = permName;
        }

        private Perm(long permId, String permName) {
            this.permId = permId;
            this.permName = permName;
        }

        Perm() {
        }

        Map permList() {
            Map permList = new LinkedHashMap();
            Map map1 = new LinkedHashMap();
            Map map2 = new LinkedHashMap();
            Map map3 = new LinkedHashMap();
            Perm perm1 = new Perm(1, "职位信息-新增");
            Perm perm2 = new Perm(2, "职位信息-编辑");
            Perm perm3 = new Perm(3, "职位信息-删除");
            Perm perm4 = new Perm(4, "公司信息-新增");
            Perm perm5 = new Perm(5, "公司信息-编辑");
            Perm perm6 = new Perm(6, "公司信息-删除");
            Perm perm7 = new Perm(7, "角色管理-新增");
            Perm perm8 = new Perm(8, "角色管理-编辑");
            Perm perm9 = new Perm(9, "角色管理-删除");
            Perm perm10 = new Perm(10, "修改密码-修改密码");
            Perm perm11 = new Perm(11, "模块管理-新增");
            Perm perm12 = new Perm(12, "模块管理-编辑");
            Perm perm13 = new Perm(13, "模块管理-删除");
            Perm perm14 = new Perm(11, "账号管理-新增");
            Perm perm15 = new Perm(12, "账号管理-编辑");
            Perm perm16 = new Perm(13, "账号管理-删除");
            Perm perm17 = new Perm(14, "Article管理-新增");
            Perm perm18 = new Perm(15, "Article管理-编辑");
            Perm perm19 = new Perm(16, "Article管理-删除");

            List list1 = new ArrayList();
            List list2 = new ArrayList();
            List list3 = new ArrayList();
            List list4 = new ArrayList();
            List list5 = new ArrayList();
            List list6 = new ArrayList();
            List list7 = new ArrayList();

            list1.add(perm1);
            list1.add(perm2);
            list1.add(perm3);
            list2.add(perm4);
            list2.add(perm5);
            list2.add(perm6);
            list3.add(perm7);
            list3.add(perm8);
            list3.add(perm9);
            list4.add(perm10);
            list5.add(perm11);
            list5.add(perm12);
            list5.add(perm13);
            list6.add(perm14);
            list6.add(perm15);
            list6.add(perm16);
            list7.add(perm17);
            list7.add(perm18);
            list7.add(perm19);

            map1.put("职位信息", list1);
            map1.put("公司信息", list2);

            map2.put("角色管理", list3);
            map2.put("修改密码", list4);
            map2.put("模块管理", list5);
            map2.put("账号管理", list6);

            map3.put("Article管理", list7);

            permList.put("信息管理", map1);
            permList.put("后台管理", map2);
            permList.put("内容管理", map3);
            return permList;
        }

    }
}
