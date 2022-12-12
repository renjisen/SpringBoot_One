package com.rjs.mapper;

import com.rjs.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserMapper {
    public List<User> loginUser(User user);
    public void addUser(User user);
    public void addUser2(User user);
    public void addUserArea(User user);

    public List<User> searchUser(String uname);
    public void delUser(int userid);
    public List<User> getAllUser();

    public List<User> getAllUser2();

    public User selectUserInfoById(int userid);

    public void updateUser(User user);
    public void getUploadFile(UploadFile uploadFile);
    public List<Tree> getTreeValue();
    public List<TreeData> getparent();

    public List<TreeData> getSecond(@Param("id") int id);

    public List<TreeData> getSun(@Param("id") int id);

    public List<Citys> getCity();

    public void insertCityId(int id);

    public List<Cascader> getparent2();

    public List<Cascader> getSecond2(@Param("id") int id);

    public void addUser3(User user);

    public Person queryByJobNumber(Person person);

    public void updatePerson(Person person);

    public void insertPerson (Person person);

    public void daoru(MultipartFile file);

    public void addProcedureAndNumber(Equip equip);

    public void addProcedureAndEquip(Equip equip);

    public void addText(String text);

    public User selectStudent(User user);

    public void uploadImg(MultipartFile file);

    public void insertImgUrl(User user);
}
