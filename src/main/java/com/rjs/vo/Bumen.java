package com.rjs.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "user")
@Scope(value = "prototype")//不是单例
public class Bumen {
    private int bumenid;
    private String bumenname;
    private String bumenexplain;
    private int bumenstatus;
    private int[] checkeduserid;


    public int[] getCheckeduserid() {
        return checkeduserid;
    }

    public void setCheckeduserid(int[] checkeduserid) {
        this.checkeduserid = checkeduserid;
    }

    public int getBumenstatus() {
        return bumenstatus;
    }

    public void setBumenstatus(int bumenstatus) {
        this.bumenstatus = bumenstatus;
    }

    public int getBumenid() {
        return bumenid;
    }

    public void setBumenid(int bumenid) {
        this.bumenid = bumenid;
    }

    public String getBumenname() {
        return bumenname;
    }

    public void setBumenname(String bumenname) {
        this.bumenname = bumenname;
    }

    public String getBumenexplain() {
        return bumenexplain;
    }

    public void setBumenexplain(String bumenexplain) {
        this.bumenexplain = bumenexplain;
    }
}
