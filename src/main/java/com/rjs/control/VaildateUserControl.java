package com.rjs.control;

import com.rjs.service.userService.UserServiceInf;
import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/vaildateUserControl")
public class VaildateUserControl {
    @Autowired
    private UserServiceInf userServiceInf;
    @ResponseBody
    @RequestMapping(value = "/addUser1")
    public String addUser(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println("验证"+bindingResult.getFieldError().getDefaultMessage());
            return bindingResult.getFieldError().getDefaultMessage();
        }else {
            userServiceInf.addUser(user);
            return "验证成功";
        }
    }
}
