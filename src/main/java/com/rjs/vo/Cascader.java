package com.rjs.vo;

import java.util.List;

public class Cascader {
    private int id;
    private String label;
    private List<Cascader> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Cascader> getChildren() {
        return children;
    }

    public void setChildren(List<Cascader> children) {
        this.children = children;
    }
}
