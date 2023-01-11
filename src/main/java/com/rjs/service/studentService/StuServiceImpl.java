package com.rjs.service.studentService;

import com.rjs.mapper.stuAuthMapper.StuAuthMapper;
import com.rjs.vo.student.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StuServiceImpl implements StuServiceInf {
    @Autowired
    private StuAuthMapper stuAuthMapper;

    public List<StudentRole> selectAllRole(){
      StudentRole studentRole = new StudentRole();
        List<StudentRole> list = stuAuthMapper.selectAllRole();
        return list;
    }
    public List<Auth> getAuthParent() {
        List<Auth> list = stuAuthMapper.getAuthParent();
        list.stream().forEach(l->{
            List<Auth> sonList = stuAuthMapper.getAuthSon(l.getAuthNameid());
            l.setAuthList(sonList);
        });
        return list;
    }

    public List<RoleAuth> selectRoleAuthandName(Integer roleid){
        return stuAuthMapper.selectRoleAuthandName(roleid);

    }

    public void insertRoleName(StudentRole studentRole){
        stuAuthMapper.insertRoleName(studentRole);
        Integer[] arr = studentRole.getCheckList();
        for (int i=0;i<arr.length;i++){
            Integer num = arr[i];
            RoleAuth roleAuth = new RoleAuth();
            roleAuth.setAuthid(arr[i]);
            roleAuth.setRoleid(studentRole.getRoleid());
            stuAuthMapper.insertRoleAuth(roleAuth);
        }
    }

    @Transactional
    public void updateRoleInfo (StudentRole studentRole){
        stuAuthMapper.updateRoleInfo(studentRole);
        stuAuthMapper.deleRoleAuthById(studentRole.getRoleid());
        Integer[] arr = studentRole.getCheckList();
        for (int i=0;i<arr.length;i++){
            Integer num = arr[i];
            RoleAuth roleAuth = new RoleAuth();
            roleAuth.setAuthid(arr[i]);
            roleAuth.setRoleid(studentRole.getRoleid());
            stuAuthMapper.insertRoleAuth(roleAuth);
        }
    }

    public List<Student> selectStuAndRole(String uname){
        return stuAuthMapper.selectStuAndRole(uname);
    }

    public void updateStuName(Student student){
        stuAuthMapper.updateStuName(student);
        StuUseridRoleid stuUseridRoleid = new StuUseridRoleid();
        stuUseridRoleid.setUserid(student.getUserid());
        stuUseridRoleid.setRoleid(student.getStuUseridRoleid().getRoleid());
        stuUseridRoleid.setUserstatus(student.getUserstatus());
        System.out.println(student.getUserstatus());
        stuAuthMapper.updateStuRole(stuUseridRoleid);
    }

    public StudentRole selectRoleNameById(Integer roleid){
      return stuAuthMapper.selectRoleNameById(roleid);
    }
}
