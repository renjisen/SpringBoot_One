package com.rjs.service.partService;

import com.alibaba.druid.util.StringUtils;
import com.rjs.mapper.partMapper.PartMapper;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class PartServiceImpl implements PartServiceInf{

    @Autowired
    private PartMapper partMapper;

    public List<Part> selectPartAll(){
        return partMapper.selectPartAll();
    }

    public void addPartInfo(Part part){
        partMapper.addPartInfo(part);
    }

    public void updatePartInfo(Part part){
        partMapper.updatePartInfo(part);
    }

    public List<Process> selectProcessById(Integer partid){
       return partMapper.selectProcessById(partid);
    }

    public Process selectProcessById2(Process process){
        Process process1 =  partMapper.selectProcessById2(process);
        String[] strArr = process1.getFileurlone().split(",");
        for (int i=0;i<strArr.length;i++){
            if (strArr[i].contains("docx")){
                process1.setFileurlone(strArr[i]);
            }
            if (strArr[i].contains("jpg")){
                process1.setFileurltwo(strArr[i]);
                //System.out.println(process1.getFileurltwo());
            }
        }
        String base64 = getBase64Code(process1.getFileurltwo());
        process1.setFileurltwo(base64);
        //System.out.println(process1.getFileurlone());
        //System.out.println(process1.getFileurltwo());
        //System.out.println(123);
        return process1;
    }

    private String getBase64Code(String filePath){
        if(StringUtils.isEmpty(filePath)) return "";
        String str = "D:\\processfile\\"+filePath;
        //System.out.println(str);
        byte[] b = new byte[0];
        File file = new File(str);
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            b = new byte[(int) file.length()];
            fileInputStream.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.getEncoder().encodeToString(b);
    }

    public List<Part> selectPartByChangAndType(Part part){
        return partMapper.selectPartByChangAndType(part);
    }

    public Process selectProEquipnumById(Integer processid){
        return partMapper.selectProEquipnumById(processid);
    }

    public Part selectPartNameAndNumById(Part part){
        return partMapper.selectPartNameAndNumById(part);
    }

    public Process selectProcessNameById(Process process){
        Process process1 = partMapper.selectProcessNameById(process);
        String[] strArr = process1.getFileurlone().split(",");
        for (int i=0;i<strArr.length;i++){
            if (strArr[i].contains("docx")){
                process1.setFileurlone(strArr[i]);
            }
            if (strArr[i].contains("jpg")){
                process1.setFileurltwo(strArr[i]);
                //System.out.println(process1.getFileurltwo());
            }
        }
        String base64 = getBase64Code(process1.getFileurltwo());
        process1.setFileurltwo(base64);
        return process1;
    }
}
