package com.rjs.mapper.bumenMapper;

import com.rjs.vo.Bumen;
import com.rjs.vo.User;

import java.util.List;

public interface BumenMapper {

    public List<Bumen> selectAllBumen();

    public List<User> selectUserByBumenIdNull();

    public  void addBumen (Bumen bumen);

    public  void updateUserBumen(User user);

    public void  updateBumenById(Bumen bumen);
}
