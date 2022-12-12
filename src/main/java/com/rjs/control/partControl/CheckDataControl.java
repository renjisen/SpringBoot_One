package com.rjs.control.partControl;

import com.rjs.service.partService.CheckDataServiceInf;
import com.rjs.vo.part.CheckData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping(value = "CheckDataControl")
public class CheckDataControl {

    @Autowired
    private CheckDataServiceInf checkDataServiceInf;
    @Autowired
    private CheckData checkData;

    @RequestMapping(value = "/AddCheckData")
    @CrossOrigin
    @ResponseBody
    public void AddCheckData(@RequestBody CheckData checkData){
        checkDataServiceInf.insertFirstCheckData(checkData);
    }

    public void gitTest(){
        System.out.println(11111);
        System.out.println(22222);
    }
}
