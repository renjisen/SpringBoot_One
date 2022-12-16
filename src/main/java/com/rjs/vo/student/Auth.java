package com.rjs.vo.student;

import com.rjs.vo.area.Area;
import lombok.Data;

import java.util.List;
@Data
public class Auth {//权限名称
    private String authname;
    private List<Auth> authList;
    private Integer authNameid;


}
