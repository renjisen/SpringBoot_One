package com.rjs.control;

import com.rjs.vo.Json;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test2Control")
public class Test2Control {

    @RequestMapping(value = "getValue")
    @CrossOrigin
    @ResponseBody
    public Json getValue(String uname,String  password){

        System.out.println("password="+password+"   uname="+uname);
        Json json = new Json();
        json.setSuccess(true);
        json.setUname("超人");
        json.setFlage("成功了");
        json.setMsg("你好号");
        return json;

    }
    @RequestMapping(value = "getValue22")
    @ResponseBody
    public Json getValue2(Json js) {

        System.out.println("id=" + js.getId() + "   uname=" + js.getUname());
        Json json = new Json();
        json.setFlage("成功了");
        json.setMsg("你好");
        return json;//http://localhost:8088/testController/getValue2
    }
}
