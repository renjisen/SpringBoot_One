package com.rjs.vo.student;

import lombok.Data;

import java.util.List;
@Data
public class StudentRole extends RoleAuth{//角色名字
    private Integer roleid;
    private String rolename;
    private String roleexplain;
    private Integer rolestatus;
    private List<RoleAuth> roleAuthList;
   private Integer[] checkList;

}
