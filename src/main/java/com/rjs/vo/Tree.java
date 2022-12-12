package com.rjs.vo;

public class Tree {
    private int parent_id;
    private int son_id;
    private String parent_laber;
    private String son_laber;

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getSon_id() {
        return son_id;
    }

    public void setSon_id(int son_id) {
        this.son_id = son_id;
    }

    public String getParent_laber() {
        return parent_laber;
    }

    public void setParent_laber(String parent_laber) {
        this.parent_laber = parent_laber;
    }

    public String getSon_laber() {
        return son_laber;
    }

    public void setSon_laber(String son_laber) {
        this.son_laber = son_laber;
    }
}
