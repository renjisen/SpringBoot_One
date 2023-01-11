package com.rjs.control.userControl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.rjs.service.userService.UserServiceInf;
import com.rjs.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "userControl")
public class UserControl {
    @Autowired
    private UserServiceInf userServiceInf;
    @Autowired
    private  User user;

    @RequestMapping(value = "/loginUser")
    @CrossOrigin
    @ResponseBody
    public List<User> loginUser( HttpServletRequest request){
        String uname =  request.getParameter("uname");
        String password =  request.getParameter("password");
        user.setUname(uname);
        user.setPassword(password);
        return  userServiceInf.loginUser(user);

    }
    @RequestMapping(value = "/addUser")
    @CrossOrigin
    @ResponseBody
    public void addUser(HttpServletRequest request) throws ParseException {

        String uname =  request.getParameter("uname");
        String password =  request.getParameter("password");
        String sex = request.getParameter("sex");
        String date = request.getParameter("date1");
        SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
        Date targeDate = (Date)formate.parseObject(date);
        user.setUname(uname);
        user.setPassword(password);
        user.setSex(sex);
        user.setDate(targeDate);
        System.out.println("aaa");
        userServiceInf.addUser(user);

    }

    @RequestMapping(value = "/addUser3")
    @CrossOrigin
    @ResponseBody
    public void addUser3(@RequestBody User user){
        userServiceInf.addUser3(user);
    }

    @RequestMapping(value = "/addUser2")
    @CrossOrigin
    @ResponseBody
    public void addUser2(@RequestBody User user) throws ParseException {
        System.out.println(user.getDate());
        userServiceInf.addUser2(user);

    }
    @RequestMapping(value = "/getAllUser")
    @CrossOrigin
    @ResponseBody
    public JsonResult getAllUser(@RequestBody User user){
        System.out.println(user.getPagenum()+" "+user.getPagesize()+" "+user.getUname());
        JsonResult jr = new JsonResult();
        List<User> list = userServiceInf.getAllUser(user);
        list.stream().forEach(l->{
            Date d = l.getDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = simpleDateFormat.format(d);
            l.setDatestr(dateStr);
            String[] strArr = l.getHobby().split(",");
            l.setHobby2(strArr);
        });
        PageInfo<User> pageInfo = new PageInfo<>(list);
        if(list != null){
            jr.setCode(1);
            jr.setMsg("查询成功");/**/
            jr.setDate(pageInfo);
        }else{
            jr.setCode(0);
            jr.setMsg("查询失败");
        }
        return jr;
    }
    @RequestMapping(value = "/getAllUser2")
    @CrossOrigin
    @ResponseBody
    public List<User> getAllUser2(){;
        return userServiceInf.getAllUser2();
    }
    @RequestMapping(value = "/selectUserInfoById")
    @CrossOrigin
    @ResponseBody
    public User selectUserInfoById(@RequestBody User user){
        int i = user.getUserid();
        return userServiceInf.selectUserInfoById(i);
    }
    @RequestMapping(value = "/searchUser")
    @CrossOrigin
    @ResponseBody
    public List<User> searchUser(HttpServletRequest request){
        String uname =  request.getParameter("uname1");
        return userServiceInf.searchUser(uname);
    }
    @RequestMapping(value = "/delUser")
    @CrossOrigin
    @ResponseBody
    public void delUser( int id){
        userServiceInf.delUser(id);
    }
    @RequestMapping(value = "/updateUser")
    @CrossOrigin
    @ResponseBody
    public void updateUser(@RequestBody User user) throws ParseException {
       userServiceInf.updateUser(user);

    }
    @RequestMapping(value = "/getUploadFile")
    @CrossOrigin
    @ResponseBody
    public void getUploadFile(@RequestParam MultipartFile[] f, UploadFile uploadFile) throws IOException {
        if (f!=null){
            for (int i=0;i<f.length;i++){
                uploadFile.setFilename(f[i].getName());
                uploadFile.setContent(f[i].getOriginalFilename());
                uploadFile.setSummary(f[i].getContentType());
                uploadFile.setFile1(f[i].getBytes());
            }
        }
        userServiceInf.getUploadFile(uploadFile);
    }
    @RequestMapping(value = "/getTreeValue")
    @CrossOrigin
    @ResponseBody
    public List<Tree> getTreeValue(){
        return userServiceInf.getTreeValue();
    }

    @RequestMapping(value = "/getTreeData")
    @CrossOrigin
    @ResponseBody
    public List<TreeData> getTreeData(){
        List<TreeData> parentList =  userServiceInf.getparent();
        parentList.stream().forEach(p->{
            List<TreeData> sonList = userServiceInf.getSecond(p.getId());
            p.setChildren(sonList);
            sonList.stream().forEach(s->{
                List<TreeData> sunList = userServiceInf.getSun(s.getId());
                s.setChildren(sunList);
            });
        });
        return parentList;
    }

    @RequestMapping(value = "/getTreeData2")
    @CrossOrigin
    @ResponseBody
    public List<Cascader> getTreeData2(){
        List<Cascader> parentList =  userServiceInf.getparent2();
        parentList.stream().forEach(p->{
            List<Cascader> sonList = userServiceInf.getSecond2(p.getId());
            p.setChildren(sonList);
        });
        return parentList;
    }

    @RequestMapping(value = "/getTuValue")
    @CrossOrigin
    @ResponseBody
    public JsonResult getTuValue(){
        JsonResult jr = new JsonResult();
        List tulist = null;
        tulist = new ArrayList();
        Echarts e1 = new Echarts();
        Echarts e2 = new Echarts();
        Echarts e3 = new Echarts();
        Echarts e4 = new Echarts();
        Echarts e5 = new Echarts();
        e1.setShuzi(100);
        e2.setShuzi(200);
        e3.setShuzi(300);
        e4.setShuzi(200);
        e5.setShuzi(100);
        tulist.add(e1);
        tulist.add(e2);
        tulist.add(e3);
        tulist.add(e4);
        tulist.add(e5);
        if (tulist!=null){
            jr.setCode(1);
            jr.setDate(tulist);
        }else{
            jr.setCode(0);
        }
        return jr;
    }

    @RequestMapping(value = "/getCity")
    @CrossOrigin
    @ResponseBody
    public List<Citys> getCity(){
        return userServiceInf.getCity();
    }

    @RequestMapping(value = "/insertCityId")
    @CrossOrigin
    @ResponseBody
    public void insertCityId(int id){
        userServiceInf.insertCityId(id);
    }

    @RequestMapping(value = "/daoru")
    @CrossOrigin
    @ResponseBody
    public String daoru(@RequestParam(value = "upload") MultipartFile file) throws Exception {
        System.out.println("123");
        userServiceInf.daoru(file);
        return "123";
    }
    @RequestMapping(value = "/addProcedureAndNumber")
    @CrossOrigin
    @ResponseBody
    public void addProcedureAndNumber(@RequestBody Equip equip){//添加设备工序的信息
        userServiceInf.addProcedureAndNumber(equip);
    }

    @RequestMapping(value = "/addText")
    @CrossOrigin
    @ResponseBody
    public void addText(@RequestParam String text){
        userServiceInf.addText(text);
    }



    @RequestMapping(value = "/selectStudent")
    @CrossOrigin
    @ResponseBody
    public Object selectStudent(@RequestBody User user){
        Jedis jedis = new Jedis("192.168.175.132",6379);
        if(!user.getCode().equals(jedis.get("code"))){
            return false;
        }
            JsonResult jr = new JsonResult();
            User user1 =  userServiceInf.selectStudent(user);
            if(user1!=null){
                String token= UUID.randomUUID().toString();//生成token
                jedis.setex("token",60*12*60,token);
                user1.setToken(token);
                String base64 = userServiceInf.loadImgByUserId(user1.getUserid());//根据id查询出img的base64,传到页面上，才可以显示出头像
                user1.setBase64(base64);
                jr.setCode(1);
                jr.setDate(user1);
                jr.setMsg("登录成功");
                return jr;
            }
            else {
                return false;
            }

    }

    @RequestMapping(value = "/uploadImg")
    @CrossOrigin
    @ResponseBody
    public String uploadImg(MultipartFile file) throws IOException {
        userServiceInf.uploadImg(file);
        return "上传成功";
    }

    @RequestMapping(value = "/selectConutByAreaOrSex")
    @CrossOrigin
    @ResponseBody
    public List<User>  selectConutByAreaOrSex(@RequestBody User user){
        List<User> list = userServiceInf.selectConutByAreaOrSex(user);
        return list;
    }

    @RequestMapping(value = "/selectConutByRoleId")
    @CrossOrigin
    @ResponseBody
    public List<User> selectConutByRoleId(@RequestBody User user){
        List<User> list = userServiceInf.selectConutByRoleId(user);
        return list;
    }

    @RequestMapping(value = "/selectUserByAreaOrSexOrRole")
    @CrossOrigin
    @ResponseBody
    public List<User> selectUserByAreaOrSexOrRole(@RequestBody User user){
        System.out.println(user.getQu()+" "+user.getSex()+" "+user.getRoleid());
        List<User> list = userServiceInf.selectUserByAreaOrSexOrRole(user);
        return list;
    }

    @RequestMapping(value = "/selectUserByAreaOrSex")
    @CrossOrigin
    @ResponseBody
    public List<User> selectUserByAreaOrSex(@RequestBody User user){
        System.out.println(user.getQu()+" "+user.getSex());
        List<User> list = userServiceInf.selectUserByAreaOrSex(user);
        return list;
    }

    @RequestMapping(value = "/selectUserByAreaOrRole")
    @CrossOrigin
    @ResponseBody
    public List<User> selectUserByAreaOrRole(@RequestBody User user){
        System.out.println(user.getQu()+" "+user.getRoleid());
        List<User> list = userServiceInf.selectUserByAreaOrRole(user);
        return list;
    }

    @RequestMapping(value = "/selectUserBySexOrRole")
    @CrossOrigin
    @ResponseBody
    public List<User> selectUserBySexOrRole(@RequestBody User user){
        System.out.println(user.getQu()+" "+user.getRoleid());
        List<User> list = userServiceInf.selectUserBySexOrRole(user);
        return list;
    }
}
