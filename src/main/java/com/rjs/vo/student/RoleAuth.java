package com.rjs.vo.student;

import lombok.Data;

import java.util.List;
@Data
public class RoleAuth extends Auth{//角色和权限的id
    private Integer roleid;
    private Integer authid;
    private Auth auth;

}
