package com.rjs.mapper.partMapper;

import com.rjs.vo.part.CheckManage;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProcessMapper {

    public void addPartProcess(Process process) throws IOException ;

    public List<CheckManage> selectCheckById(Integer processid);

    public CheckManage selectCheckById2(CheckManage checkManage);

    public void  addCheck(CheckManage checkManage);

    public void updateCheckById(CheckManage checkManage);

    public Process selectProcessById3(Process process);

    public void updatePartProcess(Process process);

    public Part selectPartById(Integer partid);

    public void addPartInfo(Part part);

    public List<Process> selectProcessById4(@Param(value="partid")Integer partid);

}
