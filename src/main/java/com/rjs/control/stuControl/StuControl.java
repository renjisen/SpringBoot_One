package com.rjs.control.stuControl;

import com.rjs.service.studentService.StuServiceInf;
import com.rjs.vo.student.Auth;
import com.rjs.vo.student.RoleAuth;
import com.rjs.vo.student.Student;
import com.rjs.vo.student.StudentRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("stuControl")
public class StuControl {
    @Autowired
    private StuServiceInf stuServiceInf;

    @RequestMapping("selectAllRole")
    @CrossOrigin
    @ResponseBody
    public List<StudentRole> selectAllRole(){
        return stuServiceInf.selectAllRole();

    }

    @RequestMapping("getAuthParent")
    @CrossOrigin
    @ResponseBody
    public List<Auth> getAuthParent() {
        return stuServiceInf.getAuthParent();
    }

    @RequestMapping("selectRoleAuthandName")
    @CrossOrigin
    @ResponseBody
    public List<RoleAuth> selectRoleAuthandName( Integer roleid){
        return stuServiceInf.selectRoleAuthandName(roleid);
    }

    @RequestMapping("insertRoleName")//添加角色和权限信息
    @CrossOrigin
    @ResponseBody
    public void insertRoleName(@RequestBody StudentRole studentRole){
         stuServiceInf.insertRoleName(studentRole);
    }

    @RequestMapping("updateRoleInfo")//更新角色和权限信息
    @CrossOrigin
    @ResponseBody
    public void updateRoleInfo (@RequestBody StudentRole studentRole){
        stuServiceInf.updateRoleInfo(studentRole);
    }

    @RequestMapping("selectStuAndRole")//更新角色和权限信息
    @CrossOrigin
    @ResponseBody
    public List<Student> selectStuAndRole(String uname){
       return stuServiceInf.selectStuAndRole(uname);
    }

    @RequestMapping("updateStuName")//更新角色和权限信息
    @CrossOrigin
    @ResponseBody
    public void updateStuName(@RequestBody Student student){
        stuServiceInf.updateStuName(student);
    }

}
