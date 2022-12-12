package com.rjs.service.bumenService;

import com.rjs.vo.Bumen;
import com.rjs.vo.User;
import org.springframework.stereotype.Controller;

import java.util.List;


public interface BumenServiceInf {

    public List<Bumen> selectAllBumen();

    public List<User> selectUserByBumenIdNull();

    public  void addBumen (Bumen bumen);

    public void  updateBumenById(Bumen bumen);
}
