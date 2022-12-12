package com.rjs.vo.student;

import java.util.List;

public class StudentRole {//角色名字
    private int roleid;
    private String rolename;
    private String roleexplain;
    private int rolestatus;
    private List<RoleAuth> roleAuthList;
    private Integer[] checkList;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoleexplain() {
        return roleexplain;
    }

    public void setRoleexplain(String roleexplain) {
        this.roleexplain = roleexplain;
    }

    public int getRolestatus() {
        return rolestatus;
    }

    public void setRolestatus(int rolestatus) {
        this.rolestatus = rolestatus;
    }

    public List<RoleAuth> getRoleAuthList() {
        return roleAuthList;
    }

    public void setRoleAuthList(List<RoleAuth> roleAuthList) {
        this.roleAuthList = roleAuthList;
    }

    public Integer[] getCheckList() {
        return checkList;
    }

    public void setCheckList(Integer[] checkList) {
        this.checkList = checkList;
    }
}
