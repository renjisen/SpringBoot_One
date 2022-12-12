package com.rjs.control.areaControl;

import com.rjs.service.areaService.AreaServiceInf;
import com.rjs.vo.User;
import com.rjs.vo.area.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "controlArea")
public class controlArea {
    @Autowired
    private AreaServiceInf areaServiceInf;
    @Autowired
    private User user;


    @RequestMapping(value = "/getArea")
    @CrossOrigin
    @ResponseBody
    public List<Area> getArea(){
        List<Area> ProvinceList =  areaServiceInf.getProvince();
        ProvinceList.stream().forEach(p->{
            System.out.println(p.getId());
            List<Area> CityList = areaServiceInf.getCitys(p.getId());
            p.setChildren(CityList);
            CityList.stream().forEach(s->{
                List<Area> ZoneList = areaServiceInf.getZone(s.getId());
                s.setChildren(ZoneList);
            });
        });
        return ProvinceList;
    }
}
