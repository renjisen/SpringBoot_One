package com.rjs.service.bumenService;

import com.rjs.mapper.bumenMapper.BumenMapper;
import com.rjs.mapper.equipMapper.EquipMapper;
import com.rjs.vo.Bumen;
import com.rjs.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BumenServiceImpl implements BumenServiceInf {

    @Autowired
    private BumenMapper bumenMapper;

    public List<Bumen> selectAllBumen(){
       return bumenMapper.selectAllBumen();
    }

    public List<User> selectUserByBumenIdNull(){
        return bumenMapper.selectUserByBumenIdNull();
    }

    public  void addBumen (Bumen bumen){
        bumenMapper.addBumen(bumen);
        int bumenid = bumen.getBumenid();
        int [] checkeduserid  = bumen.getCheckeduserid();
        for (int i=0;i<checkeduserid.length;i++){
            User u = new User();
            u.setBumenid(bumenid);
            u.setUserid(checkeduserid[i]);
            bumenMapper.updateUserBumen(u);
        }
    }

    public void  updateBumenById( Bumen bumen){
        bumenMapper.updateBumenById(bumen);
    }


}
