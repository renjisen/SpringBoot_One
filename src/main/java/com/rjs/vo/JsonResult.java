package com.rjs.vo;

public class JsonResult {
   private int code;
   private String msg;
   private Object date;
   private boolean success;


    public JsonResult() {
    }

    public JsonResult(String msg, boolean success) {
        this.msg = msg;
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
