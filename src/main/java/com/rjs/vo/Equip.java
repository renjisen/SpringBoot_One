package com.rjs.vo;

import java.util.List;

public class Equip {
    private String equipname;
    private List<Equip> equipmentnumber;
    private int equipid;
    private int status;//设备状态
    private String equipnum;//编号字符串
    private String value1;
    private String e_procedure;//工序名称
    private String e_number;//工序号
    private String[] value2;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEquipnum() {
        return equipnum;
    }

    public void setEquipnum(String equipnum) {
        this.equipnum = equipnum;
    }

    public String getEquipname() {
        return equipname;
    }
    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }
    public List<Equip> getEquipmentnumber() {
        return equipmentnumber;
    }

    public void setEquipmentnumber(List<Equip> equipmentnumber) {
        this.equipmentnumber = equipmentnumber;
    }

    public int getEquipid() {
        return equipid;
    }

    public void setEquipid(int equipid) {
        this.equipid = equipid;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getE_procedure() {
        return e_procedure;
    }

    public void setE_procedure(String e_procedure) {
        this.e_procedure = e_procedure;
    }

    public String getE_number() {
        return e_number;
    }

    public void setE_number(String e_number) {
        this.e_number = e_number;
    }

    public String[] getValue2() {
        return value2;
    }

    public void setValue2(String[] value2) {
        this.value2 = value2;
    }
}
