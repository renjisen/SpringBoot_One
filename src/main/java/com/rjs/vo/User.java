package com.rjs.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
//@ConfigurationProperties(prefix = "user")
@Scope(value = "prototype")//不是单例
@Data
public class User extends BasePojo implements Serializable {

    private String uname;
    private  String  password;
    private String realname;
    private  int userid;
    private int bumenid;
    private String bumenname;
    private  String sex;
    private int age;
    private Date date;
    private int num;
    private String text;
    private String token;
    private List<String> list;
    private int[] area;
    private String hobby;
    private String[] hobby2;
    private String datestr;
    private String province;
    private String shi;
    private String qu;
    private String regin;
    private String imgurl;
    private String base64;
    private String code;
    private int roleid;
    private String rolename;
    private int pagenum;
    private int pagesize;

}
