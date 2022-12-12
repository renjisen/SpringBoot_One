package com.rjs.service.areaService;

import com.rjs.mapper.AreaMapper.AreaMapper;
import com.rjs.vo.area.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaServiceInf{
    @Autowired
    private AreaMapper areaMapper;
    public List<Area> getProvince(){
        return areaMapper.getProvince();
    }
    public List<Area> getCitys(int id){
        return areaMapper.getCitys(id);
    }

    public List<Area> getZone(int id){
        return areaMapper.getZone(id);
    }
}
