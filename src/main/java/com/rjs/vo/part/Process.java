package com.rjs.vo.part;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope(value = "prototype")//不是单例
public class Process {
    private int processid;
    private String processname;
    private String processnumber;
    private int equipid;
    private String equipname;
    private String equipnumber;//设备编号，拼串
    private String fileurlone;
    private String fileurltwo;
    private int partid;

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname;
    }

    public String getProcessnumber() {
        return processnumber;
    }

    public void setProcessnumber(String processnumber) {
        this.processnumber = processnumber;
    }

    public int getEquipid() {
        return equipid;
    }

    public void setEquipid(int equipid) {
        this.equipid = equipid;
    }

    public int getProcessid() {
        return processid;
    }

    public void setProcessid(int processid) {
        this.processid = processid;
    }

    public String getEquipnumber() {
        return equipnumber;
    }

    public void setEquipnumber(String equipnumber) {
        this.equipnumber = equipnumber;
    }

    public String getFileurlone() {
        return fileurlone;
    }

    public void setFileurlone(String fileurlone) {
        this.fileurlone = fileurlone;
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }

    public String getFileurltwo() {
        return fileurltwo;
    }

    public void setFileurltwo(String fileurltwo) {
        this.fileurltwo = fileurltwo;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processid=" + processid +
                ", processname='" + processname + '\'' +
                ", processnumber='" + processnumber + '\'' +
                ", equipid=" + equipid +
                ", equipname='" + equipname + '\'' +
                ", equipnumber='" + equipnumber + '\'' +
                ", fileurlone='" + fileurlone + '\'' +
                ", fileurltwo='" + fileurltwo + '\'' +
                ", partid=" + partid +
                '}';
    }
}
