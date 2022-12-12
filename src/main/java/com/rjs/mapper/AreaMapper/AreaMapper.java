package com.rjs.mapper.AreaMapper;

import com.rjs.vo.TreeData;
import com.rjs.vo.area.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {
    public List<Area> getProvince();

    public List<Area> getCitys(int id);

    public List<Area> getZone( int id);
}
