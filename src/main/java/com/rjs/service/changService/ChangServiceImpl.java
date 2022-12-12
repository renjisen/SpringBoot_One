package com.rjs.service.changService;

import com.rjs.mapper.changMapper.ChangMapper;
import com.rjs.mapper.equipMapper.EquipMapper;
import com.rjs.vo.chang.Chang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangServiceImpl implements ChangServiceInf{

    @Autowired
    private ChangMapper changMapper;

    public List<Chang> selectChangAll(){
       return changMapper.selectChangAll();
    }

    public void addChang(Chang chang){
        changMapper.addChang(chang);
    }

    public void updateChangById(Chang chang){
        changMapper.updateChangById(chang);
    }

}
