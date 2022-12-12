package com.rjs.service.areaService;

import com.rjs.vo.area.Area;

import java.util.List;

public interface AreaServiceInf {

    public List<Area> getProvince();

    public List<Area> getCitys(int id);

    public List<Area> getZone(int id);

}
