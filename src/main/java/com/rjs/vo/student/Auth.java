package com.rjs.vo.student;

import com.rjs.vo.area.Area;

import java.util.List;

public class Auth {//权限名称
    private String authname;
    private List<Auth> authList;
    private int authNameid;

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    public List<Auth> getAuthList() {
        return authList;
    }

    public void setAuthList(List<Auth> authList) {
        this.authList = authList;
    }

    public int getAuthNameid() {
        return authNameid;
    }

    public void setAuthNameid(int authNameid) {
        this.authNameid = authNameid;
    }
}
