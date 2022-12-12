package com.rjs.mapper.partMapper;

import com.rjs.vo.part.CheckData;

public interface CheckDataMapper {

    public void insertFirstCheckData(CheckData checkData);

    public void insertZhongCheckData(CheckData checkData);

    public void insertEndCheckData(CheckData checkData);
}
