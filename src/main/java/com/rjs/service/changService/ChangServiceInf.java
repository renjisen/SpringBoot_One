package com.rjs.service.changService;

import com.rjs.vo.chang.Chang;

import java.util.List;

public interface ChangServiceInf {

    public List<Chang> selectChangAll();

    public void addChang(Chang chang);

    public void updateChangById(Chang chang);
}
