package com.rjs.control.partControl;


import com.rjs.service.partService.PartServiceInf;
import com.rjs.service.partService.ProcessServiceInf;
import com.rjs.vo.part.CheckManage;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "ProcessControl")
public class ProcessControl {

    @Autowired
    private ProcessServiceInf processServiceInf;
    @Autowired
    private Process process;

    @RequestMapping(value = "/addPartProcess")
    @CrossOrigin
    @ResponseBody
    public void addPartProcess(Process process, @RequestParam("upload") MultipartFile[] multipartFile) throws IOException {
        System.out.println(multipartFile.length);
        System.out.println(process.toString());
        processServiceInf.addPartProcess(process,multipartFile);
    }

    @RequestMapping(value = "/selectCheckById")
    @CrossOrigin
    @ResponseBody
    public List<CheckManage> selectCheckById(@RequestParam Integer processid){
        System.out.println(processid);
        return processServiceInf.selectCheckById(processid);
    }

    @RequestMapping(value = "/addCheck")
    @CrossOrigin
    @ResponseBody
    public void  addCheck(@RequestBody CheckManage checkManage){
        processServiceInf.addCheck(checkManage);
    }

    @RequestMapping(value = "/updateCheckById")
    @CrossOrigin
    @ResponseBody
    public void updateCheckById(@RequestBody CheckManage checkManage){
        processServiceInf.updateCheckById(checkManage);
    }

    @RequestMapping(value = "/selectCheckById2")
    @CrossOrigin
    @ResponseBody
    public void selectCheckById2(@RequestBody CheckManage checkManage){
         processServiceInf.selectCheckById2(checkManage);
    }

    @RequestMapping(value = "/selectProcessById3")
    @CrossOrigin
    @ResponseBody
    public void selectProcessById3(@RequestBody Process process) throws IOException {
        processServiceInf.selectProcessById3(process);
    }

    @RequestMapping(value = "/updatePartProcess")
    @CrossOrigin
    @ResponseBody
    public void updatePartProcess(Process process, @RequestParam("upload") MultipartFile[] multipartFile){
        processServiceInf.updatePartProcess(process,multipartFile);
    }

    @RequestMapping(value = "/selectPartById")
    @CrossOrigin
    @ResponseBody
    public void selectPartById( @RequestParam Integer partid) throws IOException {
        processServiceInf.selectPartById(partid);
    }
}
