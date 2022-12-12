package com.rjs.vo.student;

import java.util.List;

public class RoleAuth {//角色和权限的id
    private Integer roleid;
    private Integer authid;
    private Auth auth;


    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getAuthid(Integer integer) {
        return authid;
    }

    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
}
