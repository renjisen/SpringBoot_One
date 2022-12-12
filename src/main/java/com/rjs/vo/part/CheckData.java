package com.rjs.vo.part;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//不是单例
public class CheckData {
    private int firstcheckdataid;
    private int zhongcheckdataid;
    private int endcheckdataid;
    private int[] recordmethod;

    private int[][] firstpartnumarr;
    private int[][] zhongpartnumarr;
    private int[][] endpartnumarr;
    private int[] checkid;

    private int checkdata;
    private int checkid2;
    private int recordmethod2;

    public int getFirstcheckdataid() {
        return firstcheckdataid;
    }

    public void setFirstcheckdataid(int firstcheckdataid) {
        this.firstcheckdataid = firstcheckdataid;
    }

    public int getZhongcheckdataid() {
        return zhongcheckdataid;
    }

    public void setZhongcheckdataid(int zhongcheckdataid) {
        this.zhongcheckdataid = zhongcheckdataid;
    }

    public int getEndcheckdataid() {
        return endcheckdataid;
    }

    public void setEndcheckdataid(int endcheckdataid) {
        this.endcheckdataid = endcheckdataid;
    }

    public int[] getRecordmethod() {
        return recordmethod;
    }

    public void setRecordmethod(int[] recordmethod) {
        this.recordmethod = recordmethod;
    }

    public int[][] getFirstpartnumarr() {
        return firstpartnumarr;
    }

    public void setFirstpartnumarr(int[][] firstpartnumarr) {
        this.firstpartnumarr = firstpartnumarr;
    }

    public int[][] getZhongpartnumarr() {
        return zhongpartnumarr;
    }

    public void setZhongpartnumarr(int[][] zhongpartnumarr) {
        this.zhongpartnumarr = zhongpartnumarr;
    }

    public int[][] getEndpartnumarr() {
        return endpartnumarr;
    }

    public void setEndpartnumarr(int[][] endpartnumarr) {
        this.endpartnumarr = endpartnumarr;
    }

    public int[] getCheckid() {
        return checkid;
    }

    public void setCheckid(int[] checkid) {
        this.checkid = checkid;
    }

    public int getCheckdata() {
        return checkdata;
    }

    public void setCheckdata(int checkdata) {
        this.checkdata = checkdata;
    }

    public int getCheckid2() {
        return checkid2;
    }

    public void setCheckid2(int checkid2) {
        this.checkid2 = checkid2;
    }

    public int getRecordmethod2() {
        return recordmethod2;
    }

    public void setRecordmethod2(int recordmethod2) {
        this.recordmethod2 = recordmethod2;
    }
}
