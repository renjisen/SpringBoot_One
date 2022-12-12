package com.rjs.control.changControl;

import com.rjs.service.changService.ChangServiceInf;
import com.rjs.service.userService.UserServiceInf;
import com.rjs.vo.User;
import com.rjs.vo.chang.Chang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "ChangControl")
public class ChangControl {
    @Autowired
    private ChangServiceInf changServiceInf;
    @Autowired
    private Chang chang;

    @RequestMapping(value = "/selectChangAll")
    @CrossOrigin
    @ResponseBody
    public List<Chang> selectChangAll(){
        return changServiceInf.selectChangAll();
    }

    @RequestMapping(value = "/addChang")
    @CrossOrigin
    @ResponseBody
    public void addChang(@RequestBody Chang chang){
        changServiceInf.addChang(chang);
    }

    @RequestMapping(value = "/updateChangById")
    @CrossOrigin
    @ResponseBody
    public void updateChangById(@RequestBody Chang chang){
        changServiceInf.updateChangById(chang);
    }
}
