package com.rjs.vo.chang;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//不是单例
public class Chang {

    private int changid;
    private String changname;
    private int changstatus;

    public int getChangid() {
        return changid;
    }

    public void setChangid(int changid) {
        this.changid = changid;
    }

    public String getChangname() {
        return changname;
    }

    public void setChangname(String changname) {
        this.changname = changname;
    }

    public int getChangstatus() {
        return changstatus;
    }

    public void setChangstatus(int changstatus) {
        this.changstatus = changstatus;
    }
}
