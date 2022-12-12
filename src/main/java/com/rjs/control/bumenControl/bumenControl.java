package com.rjs.control.bumenControl;

import com.rjs.service.bumenService.BumenServiceInf;
import com.rjs.service.userService.UserServiceInf;
import com.rjs.vo.Bumen;
import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "bumenControl")
public class bumenControl {

    @Autowired
    private BumenServiceInf bumenServiceInf;
    @Autowired
    private Bumen bumen;

    @RequestMapping(value = "/selectAllBumen")
    @CrossOrigin
    @ResponseBody
    public List<Bumen> selectAllBumen(){
        return bumenServiceInf.selectAllBumen();
    }

    @RequestMapping(value = "/selectUserByBumenIdNull")
    @CrossOrigin
    @ResponseBody
    public List<User> selectUserByBumenIdNull(){
        return bumenServiceInf.selectUserByBumenIdNull();
    }

    @RequestMapping(value = "/addBumen")
    @CrossOrigin
    @ResponseBody
    public  void addBumen (@RequestBody Bumen bumen){
        bumenServiceInf.addBumen(bumen);

    }

    @RequestMapping(value = "/updateBumenById")
    @CrossOrigin
    @ResponseBody
    public void  updateBumenById(@RequestBody Bumen bumen){
        bumenServiceInf.updateBumenById(bumen);
    }

}
