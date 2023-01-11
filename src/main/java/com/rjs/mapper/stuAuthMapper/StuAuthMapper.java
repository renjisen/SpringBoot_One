package com.rjs.mapper.stuAuthMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rjs.vo.student.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuAuthMapper extends BaseMapper<StudentRole> {
    public List<StudentRole> selectAllRole();

    public List<Auth> getAuthParent();

    public List<Auth> getAuthSon(int authid);

    public List<RoleAuth> selectRoleAuthandName(Integer roleid);

    public void insertRoleName(StudentRole studentRole);

    public void insertRoleAuth(RoleAuth roleAuth);

    public void updateRoleInfo (StudentRole studentRole);

    public void deleRoleAuthById (Integer roleid);

    public List<Student> selectStuAndRole(@Param("uname") String uname);

    public void updateStuName(Student student);

    public void updateStuRole(StuUseridRoleid stuUseridRoleid);

    public StudentRole selectRoleNameById(Integer roleid);
}
