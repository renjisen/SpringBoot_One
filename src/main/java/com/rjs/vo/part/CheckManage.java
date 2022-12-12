package com.rjs.vo.part;

public class CheckManage {
    private int checkid;
    private String checkname;
    private String checkchar;
    private int firstpartnum;
    private int zhongpartnum;
    private int endpartnum;
    private int processid;
    private int recordmethod;

    public int getCheckid() {
        return checkid;
    }

    public void setCheckid(int checkid) {
        this.checkid = checkid;
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname;
    }

    public String getCheckchar() {
        return checkchar;
    }

    public void setCheckchar(String checkchar) {
        this.checkchar = checkchar;
    }

    public int getFirstpartnum() {
        return firstpartnum;
    }

    public void setFirstpartnum(int firstpartnum) {
        this.firstpartnum = firstpartnum;
    }

    public int getProcessid() {
        return processid;
    }

    public void setProcessid(int processid) {
        this.processid = processid;
    }

    public int getZhongpartnum() {
        return zhongpartnum;
    }

    public void setZhongpartnum(int zhongpartnum) {
        this.zhongpartnum = zhongpartnum;
    }

    public int getEndpartnum() {
        return endpartnum;
    }

    public void setEndpartnum(int endpartnum) {
        this.endpartnum = endpartnum;
    }

    public int getRecordmethod() {
        return recordmethod;
    }

    public void setRecordmethod(int recordmethod) {
        this.recordmethod = recordmethod;
    }

    @Override
    public String toString() {
        return "CheckManage{" +
                "checkid=" + checkid +
                ", checkname='" + checkname + '\'' +
                ", checkchar='" + checkchar + '\'' +
                ", firstpartnum=" + firstpartnum +
                ", processid=" + processid +
                '}';
    }
}
