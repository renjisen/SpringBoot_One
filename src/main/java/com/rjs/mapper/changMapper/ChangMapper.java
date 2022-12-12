package com.rjs.mapper.changMapper;

import com.rjs.vo.chang.Chang;

import java.util.List;

public interface ChangMapper {

    public List<Chang> selectChangAll();

    public void addChang(Chang chang);

    public void updateChangById(Chang chang);
}
