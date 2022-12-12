package com.rjs.service.partService;

import com.rjs.vo.part.CheckManage;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;

import java.util.List;

public interface PartServiceInf {

    public List<Part> selectPartAll();

    public void addPartInfo(Part part);

    public void updatePartInfo(Part part);

    public List<Process> selectProcessById(Integer partid);

    public Process selectProcessById2(Process process);

    public List<Part> selectPartByChangAndType(Part part);

    public Process selectProEquipnumById(Integer processid);

    public Part selectPartNameAndNumById(Part part);

    public Process selectProcessNameById(Process process);
}
