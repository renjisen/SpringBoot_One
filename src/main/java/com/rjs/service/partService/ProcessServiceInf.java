package com.rjs.service.partService;

import com.rjs.vo.part.CheckManage;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProcessServiceInf {

    public void addPartProcess(Process process, MultipartFile[] multipartFile) throws IOException;

    public List<CheckManage> selectCheckById(Integer processid);

    public void  addCheck(CheckManage checkManage);

    public void updateCheckById(CheckManage checkManage);

    public void selectCheckById2(CheckManage checkManage);

    public void selectProcessById3(Process process) throws IOException;

    public void updatePartProcess(Process process, MultipartFile[] multipartFile);

    public void selectPartById(Integer partid) throws IOException;
}
