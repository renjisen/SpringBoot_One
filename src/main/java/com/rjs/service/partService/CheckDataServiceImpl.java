package com.rjs.service.partService;

import com.rjs.mapper.partMapper.CheckDataMapper;
import com.rjs.vo.part.CheckData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckDataServiceImpl implements CheckDataServiceInf {
    @Autowired
    private CheckDataMapper checkDataMapper;

    public void insertFirstCheckData(CheckData checkData){
        int[][] firstpartnumarr = checkData.getFirstpartnumarr();
        int[][] zhongpartnumarr = checkData.getZhongpartnumarr();
        int[][] endpartnumarr = checkData.getEndpartnumarr();
        int [] checkid = checkData.getCheckid();
        int[] recordmethod = checkData.getRecordmethod();
        CheckData checkData1 = new CheckData();

        for(int i=0;i<firstpartnumarr.length;i++){
            for(int j=1;j<firstpartnumarr[i].length;j++){
                //System.out.println(firstpartnumarr[i][j]);
                checkData1.setCheckdata(firstpartnumarr[i][j]);
                //System.out.println(checkid[i]);
                checkData1.setCheckid2(checkid[i]);
                //System.out.println("---------------------------");
                //System.out.println(recordmethod[i]);
                checkData1.setRecordmethod2(recordmethod[i]);
                checkDataMapper.insertFirstCheckData(checkData1);
            }
        }
        checkData1.setCheckid2(0);
        checkData1.setRecordmethod2(0);
        for(int i=0;i<zhongpartnumarr.length;i++){
            for(int j=1;j<zhongpartnumarr[i].length;j++){
                checkData1.setCheckdata(zhongpartnumarr[i][j]);
                checkData1.setCheckid2(checkid[i]);
                checkData1.setRecordmethod2(recordmethod[i]);
                checkDataMapper.insertZhongCheckData(checkData1);
            }
        }
        checkData1.setCheckid2(0);
        checkData1.setRecordmethod2(0);
        for(int i=0;i<endpartnumarr.length;i++){
            for(int j=1;j<endpartnumarr[i].length;j++){
                checkData1.setCheckdata(endpartnumarr[i][j]);
                checkData1.setCheckid2(checkid[i]);
                checkData1.setRecordmethod2(recordmethod[i]);
                checkDataMapper.insertEndCheckData(checkData1);
            }
        }
    }
}
