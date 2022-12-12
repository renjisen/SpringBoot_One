package com.rjs.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping(value = "/helloControl")
public class HelloControl {

    @RequestMapping(value = "/say")
    @ResponseBody
        public String Say(){
        System.out.println("111");
        return "hello...";
        }

}
