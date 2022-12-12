package com.rjs.vo;

import java.util.List;

public class TreeData {
    private String label;
    private List<TreeData> children;
    private int id;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<TreeData> getChildren() {
        return children;
    }

    public void setChildren(List<TreeData> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
