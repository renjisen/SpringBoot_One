package com.rjs.control.partControl;

import com.rjs.service.partService.PartServiceInf;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping(value = "PartControl")
public class PartControl {

    @Autowired
    private PartServiceInf partServiceInf;
    @Autowired
    private Part part;

    @RequestMapping(value = "/selectPartAll")
    @CrossOrigin
    @ResponseBody
    public List<Part> selectPartAll(){
        return partServiceInf.selectPartAll();
    }

    @RequestMapping(value = "/addPartInfo")
    @CrossOrigin
    @ResponseBody
    public void addPartInfo(@RequestBody Part part){
        partServiceInf.addPartInfo(part);
    }

    @RequestMapping(value = "/updatePartInfo")
    @CrossOrigin
    @ResponseBody
    public void updatePartInfo(@RequestBody Part part){
        partServiceInf.updatePartInfo(part);
    }

    @RequestMapping(value = "/selectProcessById")
    @CrossOrigin
    @ResponseBody
    public List<Process> selectProcessById(@RequestParam Integer partid){
       return partServiceInf.selectProcessById(partid);
    }

    @RequestMapping(value = "/selectProcessById2")
    @CrossOrigin
    @ResponseBody
    public Process selectProcessById2(@RequestBody Process process){
        return partServiceInf.selectProcessById2(process);
    }

    @RequestMapping(value = "/selectPartByChangAndType")
    @CrossOrigin
    @ResponseBody
    public List<Part> selectPartByChangAndType(@RequestBody Part part){
        return partServiceInf.selectPartByChangAndType(part);
    }

    @RequestMapping(value = "/selectProEquipnumById")
    @CrossOrigin
    @ResponseBody
    public Process selectProEquipnumById(@RequestParam Integer processid){
        return partServiceInf.selectProEquipnumById(processid);
    }

    @RequestMapping(value = "/selectPartNameAndNumById")//根据零件的id查询零件的name和编号
    @CrossOrigin
    @ResponseBody
    public Part selectPartNameAndNumById(@RequestBody Part part){
        return partServiceInf.selectPartNameAndNumById(part);
    }

    @RequestMapping(value = "/selectProcessNameById")//根据processID查询出processname
    @CrossOrigin
    @ResponseBody
    public Process selectProcessNameById(@RequestBody Process process){
        return partServiceInf.selectProcessNameById(process);
    }

}
