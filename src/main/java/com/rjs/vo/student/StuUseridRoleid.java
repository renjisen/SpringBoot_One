package com.rjs.vo.student;

public class StuUseridRoleid {//个人ID和角色id
    private int userid;
    private int roleid;
    private int userstatus;
    private StudentRole studentRole;

    public int getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(int userstatus) {
        this.userstatus = userstatus;
    }

    public StudentRole getStudentRole() {
        return studentRole;
    }

    public void setStudentRole(StudentRole studentRole) {
        this.studentRole = studentRole;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
}
