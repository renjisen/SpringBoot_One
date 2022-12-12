package com.rjs.service.userService;

import com.rjs.vo.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface UserServiceInf {
    public List<User> loginUser(User user);
    public void addUser(User user);
    public void addUser2(User user) throws ParseException;
    public List<User> searchUser(String uname);
    public void delUser(int userid);
    public List<User> getAllUser(User user);

    public List<User> getAllUser2();

    public User selectUserInfoById(int userid);

    public void updateUser(User user);
    public void getUploadFile(UploadFile uploadFile);
    public List<Tree> getTreeValue();
    public List<TreeData> getparent();

    public List<TreeData> getSecond(int id);

    public List<TreeData> getSun(int id);

    public List<Citys> getCity();

    public void insertCityId(int id);

    public List<Cascader> getparent2();

    public List<Cascader> getSecond2(int id);

    public void addUser3(User user);

    public void daoru(MultipartFile file) throws Exception;

    public void addProcedureAndNumber(Equip equip);

    public void addText(String text);


    public User selectStudent(User user);

    public void uploadImg(MultipartFile file) throws IOException;

    public String loadImgByUserId(int userid);


}
