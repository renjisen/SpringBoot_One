package com.rjs.service.equipService;

import com.alibaba.fastjson.JSON;
import com.rjs.mapper.equipMapper.EquipMapper;
import com.rjs.vo.Equip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class EquipServiceImpl implements  EquipServiceInf{
    @Autowired
    private EquipMapper equipMapper;

    @Transactional
    public void addequip(Equip equip){
        System.out.println("id="+equip.getEquipid());
        equipMapper.addequip(equip);
        List<Equip> list = equip.getEquipmentnumber();
        for(int i = 0;i<list.size();i++){
            System.out.println(JSON.toJSONString(list.get(i)));
            Equip e = JSON.parseObject(JSON.toJSONString(list.get(i)),Equip.class);
            String value = e.getValue1();
            int equipid = equip.getEquipid();
            Equip e2 = new Equip();
            e2.setEquipid(equipid);
            e2.setValue1(value);
            System.out.println(value+"-------------------");
            equipMapper.addequipnumber(e2);
        }
    }


    public List selectAllEquip(){

        return equipMapper.selectAllEquip();
    }
    public List<Equip> selectEquipNumber(Equip equip){
        return equipMapper.selectEquipNumber(equip);
    }

    public void delEquipNumber(@RequestBody Equip equip){
        equipMapper.delEquipNumber(equip);
        equipMapper.updateEquipStatus(equip);
        List<Equip> list = equip.getEquipmentnumber();
        for(int i = 0;i<list.size();i++) {
            System.out.println(JSON.toJSONString(list.get(i)));
            Equip e = JSON.parseObject(JSON.toJSONString(list.get(i)), Equip.class);
            String value = e.getValue1();
            int equipid = equip.getEquipid();
            Equip e2 = new Equip();
            e2.setEquipid(equipid);
            e2.setValue1(value);
            System.out.println(value + "-------------------");
            equipMapper.addequipnumber(e2);
        }
    }

    public void delEquipNumber2(@RequestParam("equipid") int equipid){
        equipMapper.delEquipNumber2(equipid);
    }
}
