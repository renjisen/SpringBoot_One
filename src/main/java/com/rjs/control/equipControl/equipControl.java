package com.rjs.control.equipControl;

import com.rjs.service.equipService.EquipServiceInf;
import com.rjs.vo.Equip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "equipControl")
public class equipControl {

    @Autowired
    private EquipServiceInf equipServiceInf;
    @RequestMapping(value = "/addequip")
    @CrossOrigin
    @ResponseBody
    public void addequip (@RequestBody Equip equip){

        equipServiceInf.addequip(equip);
    }

    @RequestMapping(value = "/selectAllEquip")
    @CrossOrigin
    @ResponseBody
    public List<Equip> selectAllEquip (){
        List<Equip> list = equipServiceInf.selectAllEquip();
        return list;
    }

    @RequestMapping(value = "/selectEquipNumber")
    @CrossOrigin
    @ResponseBody

    public List<Equip> selectEquipNumber (@RequestBody Equip equip){
        List<Equip> list = equipServiceInf.selectEquipNumber(equip);
        return list;
    }

    @RequestMapping(value = "/updateEquipAndNumber")
    @CrossOrigin
    @ResponseBody
    public void updateEquipAndNumber(@RequestBody Equip equip){

        equipServiceInf.delEquipNumber(equip);
    }

    @RequestMapping(value = "/delEquipNumber2")
    @CrossOrigin
    @ResponseBody
    public void delEquipNumber2(@RequestParam("equipid") int equipid){

        equipServiceInf.delEquipNumber2(equipid);
    }

}
