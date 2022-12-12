package com.rjs.vo.student;

import java.io.Serializable;

public class Student extends StuUseridRoleid{
    private int userid;
    private String uname;
    private String password;
    private int age;
    private StuUseridRoleid stuUseridRoleid;

    public StuUseridRoleid getStuUseridRoleid() {
        return stuUseridRoleid;
    }

    public void setStuUseridRoleid(StuUseridRoleid stuUseridRoleid) {
        this.stuUseridRoleid = stuUseridRoleid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
