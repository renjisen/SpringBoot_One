package com.rjs.mapper.equipMapper;

import com.rjs.vo.Equip;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface EquipMapper {

    public void addequip(Equip equip);

    public void addequipnumber(Equip equip);

    public List<Equip> selectAllEquip();

    public List<Equip> selectEquipNumber(Equip equip);

    public void updateEquipStatus(Equip equip);

    public void delEquipNumber(@RequestBody Equip equip);

    public void delEquipNumber2(@RequestParam("equipid") int equipid);
}
