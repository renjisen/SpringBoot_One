package com.rjs.service.equipService;

import com.rjs.vo.Equip;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface EquipServiceInf {


    public void addequip(Equip equipname);

    public List<Equip> selectAllEquip();

    public List<Equip> selectEquipNumber(Equip equip);

    public void delEquipNumber(Equip equip);

    public void delEquipNumber2(@RequestParam("equipid") int equipid);
}
