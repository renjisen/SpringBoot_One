package com.rjs.service.studentService;

import com.rjs.vo.student.Auth;
import com.rjs.vo.student.RoleAuth;
import com.rjs.vo.student.Student;
import com.rjs.vo.student.StudentRole;

import java.util.List;

public interface StuServiceInf {
    public List<StudentRole> selectAllRole();

    public List<Auth> getAuthParent();

    public List<RoleAuth> selectRoleAuthandName(Integer roleid);

    public void insertRoleName(StudentRole studentRole);

    public void updateRoleInfo (StudentRole studentRole);

    public List<Student> selectStuAndRole(String uname);

    public void updateStuName(Student student);
}
