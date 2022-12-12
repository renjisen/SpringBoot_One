package com.rjs.vo.part;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//不是单例
public class Part {
    private int partid;
    private String partname;
    private String partnumber;
    private int changid;//工厂的id
    private String changname;//工厂的名字
    private String parttype;
    private int processid;

    public int getProcessid() {
        return processid;
    }

    public void setProcessid(int processid) {
        this.processid = processid;
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public int getChangid() {
        return changid;
    }

    public void setChangid(int changid) {
        this.changid = changid;
    }

    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype;
    }

    public String getChangname() {
        return changname;
    }

    public void setChangname(String changname) {
        this.changname = changname;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partid=" + partid +
                ", partname='" + partname + '\'' +
                ", partnumber='" + partnumber + '\'' +
                ", changid=" + changid +
                ", changname='" + changname + '\'' +
                ", parttype='" + parttype + '\'' +
                '}';
    }
}
