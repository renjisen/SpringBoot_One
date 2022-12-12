package com.rjs.service.userService;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.rjs.mapper.UserMapper;
import com.rjs.vo.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

@Service
public  class UserServiceImpl implements UserServiceInf {
    @Autowired
    private UserMapper userMapper;
    //@Transactional
    public List<User> loginUser(User user){

        return userMapper.loginUser(user);
    }
    public void addUser(User user){
         userMapper.addUser(user);

    }
    public void addUser2(User user) throws ParseException {
        userMapper.addUser2(user);

    }
    public List getAllUser(User user){
        PageHelper.startPage(user.getPagenum(),user.getPagesize());

        return   userMapper.getAllUser();
    }

    public List<User> getAllUser2(){
        return   userMapper.getAllUser2();
    }

    @Override
    public User selectUserInfoById(int userid) {
        return null;
    }

    public User selectUserInfoById(User user){
        return  userMapper.selectUserInfoById( user.getUserid());
    }
    public List<User> searchUser(String uname){
      return   userMapper.searchUser(uname);
    }
    public void delUser(int userid){
         userMapper.delUser(userid);
    }
    public void updateUser(User user){
        userMapper.updateUser(user);
    }
    public void getUploadFile(UploadFile uploadFile){
        userMapper.getUploadFile(uploadFile);
    }
    public List<Tree> getTreeValue(){
        return userMapper.getTreeValue();
    }

    public List<TreeData> getparent(){
        return userMapper.getparent();
    }

    public List<TreeData> getSecond(int id){
        return userMapper.getSecond(id);
    }

    public List<TreeData> getSun(int id){
        return userMapper.getSun(id);
    }

    public List<Citys> getCity(){
        return userMapper.getCity();
    }

    public void insertCityId(int id){
         userMapper.insertCityId(id);
    }

    public List<Cascader> getparent2(){
        return userMapper.getparent2();
    }

    public List<Cascader> getSecond2(int id){
        return userMapper.getSecond2(id);
    }

    public void addUser3(User user){
        userMapper.addUser3(user);
    }

    public void daoru(MultipartFile file) throws Exception {
        Workbook readwb=null;
        if (!file.isEmpty()){
            InputStream insert = file.getInputStream();
            readwb = Workbook.getWorkbook(insert);
            Sheet readsheet = readwb.getSheet(0);
            int rsColums = readsheet.getColumns();//列
            int rsRows = readsheet.getRows();//行
            for (int i=0;i<rsRows;i++){
                Person person = new Person();
                for(int j=0;j<rsColums;j++){
                    Cell cell = readsheet.getCell(j,i);
                    switch (j){
                        case 0:
                            person.setId(cell.getContents());
                            continue;
                        case 1:
                            person.setUname(cell.getContents());
                            continue;
                        case 2:
                            person.setPasssword(cell.getContents());
                            continue;
                        case 3:
                            person.setSex(cell.getContents());
                        default:
                            break;
                    }
                }
                Person person2=this.userMapper.queryByJobNumber(person);
                if(person2!=null){
                    userMapper.updatePerson(person);
                }else{
                    userMapper.insertPerson(person);
                }
            }

        }
    }
    public void addProcedureAndNumber(Equip equip){
        userMapper.addProcedureAndNumber(equip);
        String[] value2 = equip.getValue2();//地址
        for(int i = 0;i<value2.length;i++) {
            System.out.println(value2[i]);
            String e_number = equip.getE_number();
            Equip e2 = new Equip();
            e2.setE_number(e_number);
            e2.setValue1(value2[i]);
            userMapper.addProcedureAndEquip(e2);
        }
    }

    public void addText(String text){
        userMapper.addText(text);
    }

    public User selectStudent(User user){
        User user1 = userMapper.selectStudent(user);
        return user1;
    }

    private static final String HEAD_FILE_DIR="D:\\uploadImg\\";
    public void uploadImg(MultipartFile file) throws IOException {
        String extensionName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));//获取后缀
        String path = HEAD_FILE_DIR+ UUID.randomUUID().toString()+extensionName;//路径
        File imgFile = new File(path);
        file.transferTo(imgFile);
        User user = new User();
        user.setImgurl(path);
        user.setUserid(3);
        userMapper.insertImgUrl(user);//向数据库存img的路径根据id
    }

    public String loadImgByUserId(int userid){
        User user =  userMapper.selectUserInfoById(userid);
        return getBase64Code(user.getImgurl());
    }

    private String getBase64Code(String filePath){
        if(StringUtils.isEmpty(filePath)) return "";
       byte[] b = new byte[0];
       File file = new File(filePath);
       try (FileInputStream fileInputStream = new FileInputStream(file)){
           b = new byte[(int) file.length()];
           fileInputStream.read(b);
        } catch (IOException e) {
           e.printStackTrace();
       }
       return Base64.getEncoder().encodeToString(b);
    }



}
