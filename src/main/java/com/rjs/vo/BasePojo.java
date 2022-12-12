package com.rjs.vo;

public class BasePojo {
    private int pagenum;//当前页
    private int pagesize;//每页多少条


    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
