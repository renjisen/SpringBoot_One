package com.rjs.control;


import com.rjs.vo.Json;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping(value = "testController")
public class TestController {
@RequestMapping(value = "getValue11")
@ResponseBody
    public Json getValue1(@RequestBody Json Js){//参数是对象的话,传值不能是空;参数是对象的话,只能是post传值
    System.out.println(Js.getUname()+" "+ Js.getPassword());

    return Js;
    }
    @RequestMapping(value = "getValue2")
    @ResponseBody
    public Json getValue2(@RequestBody Json json){//http://localhost:8088/testController/getValue2
       // System.out.println("uname           :"+uname+"password          "+password);
        System.out.println("getValue2...");
      //  Json json = new Json();
        json.setMsg("成功了");
        json.setFlage("hello");
        return json;

    }
}
