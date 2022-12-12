package com.rjs.service.partService;

import com.rjs.mapper.partMapper.ProcessMapper;
import com.rjs.vo.part.CheckManage;
import com.rjs.vo.part.Part;
import com.rjs.vo.part.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProcessServiceImpl implements ProcessServiceInf{

    @Autowired
    private ProcessMapper processMapper;
    @Value("${file.upload.dir}")
    private String basePath;

//    private static final String HEAD_FILE_DIR="D:\\processfile\\";
//    public void addPartProcess(Process process, MultipartFile[] multipartFile) throws IOException {
//        String path2 = "";
//        for (int i=0;i<multipartFile.length;i++){
//            String extensionName = multipartFile[i].getOriginalFilename().substring(multipartFile[i].getOriginalFilename().lastIndexOf("."));
//            String path = HEAD_FILE_DIR+ UUID.randomUUID().toString()+extensionName+",";//路径
//            path2=path2+path;
//            File imgFile = new File(path);
//            multipartFile[i].transferTo(imgFile);
//            process.setFileurlone(path2);
//        }
//        processMapper.addPartProcess(process);
//    }

    public void addPartProcess(Process process, MultipartFile[] multipartFile) throws IOException {
        String path2 = "";
        for (int i=0;i<multipartFile.length;i++){
            String extensionName = multipartFile[i].getOriginalFilename().substring(multipartFile[i].getOriginalFilename().lastIndexOf("."));
            String path = UUID.randomUUID().toString()+extensionName;//路径
            path2=path2+path+",";
            File dir = new File(basePath);
            if (!dir.exists()) {
                //目录不存在，需要创建
                dir.mkdirs();
            }
            try {
                // 4、将临时文件转存到指定位置
                multipartFile[i].transferTo(new File(basePath + path));
                process.setFileurlone(path2);
                System.out.println(path);
                System.out.println(basePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        processMapper.addPartProcess(process);
    }

    public List<CheckManage> selectCheckById(Integer processid){
        return processMapper.selectCheckById(processid);
    }

    public void  addCheck(CheckManage checkManage){
        processMapper.addCheck(checkManage);
    }

    public void updateCheckById(CheckManage checkManage){
        processMapper.updateCheckById(checkManage);
    }

    public void selectCheckById2(CheckManage checkManage){
        CheckManage checkManage1 = processMapper.selectCheckById2(checkManage);
        processMapper.addCheck(checkManage1);
    }

    public void selectProcessById3(Process process) throws IOException {
        List<CheckManage> checkManageList = processMapper.selectCheckById(process.getProcessid());//根据processID查询查checkedtable内容
        Process process1 = processMapper.selectProcessById3(process);//根据partid和processid查询工序
        processMapper.addPartProcess(process1);//添加查询出来的内容到processtable表格
        for(int i=0;i<checkManageList.size();i++){
            checkManageList.get(i).setProcessid(process1.getProcessid());//更改将要插入的checktable的processID
            processMapper.addCheck(checkManageList.get(i));
        }
    }

    public void updatePartProcess(Process process, MultipartFile[] multipartFile){
        String path2 = "";
        for (int i=0;i<multipartFile.length;i++){
            String extensionName = multipartFile[i].getOriginalFilename().substring(multipartFile[i].getOriginalFilename().lastIndexOf("."));
            String path = UUID.randomUUID().toString()+extensionName;//路径
            path2=path2+path+",";
            File dir = new File(basePath);
            if (!dir.exists()) {
                //目录不存在，需要创建
                dir.mkdirs();
            }
            try {
                // 4、将临时文件转存到指定位置
                multipartFile[i].transferTo(new File(basePath + path));
                process.setFileurlone(path2);
                System.out.println(path);
                System.out.println(basePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        processMapper.updatePartProcess(process);
    }

    public void selectPartById(Integer partid) throws IOException {
        List<Process> processList =  processMapper.selectProcessById4(partid);//根据id查询process
       Part part = processMapper.selectPartById(partid);//查询part，然后添加
       processMapper.addPartInfo(part);
       for(int i=0;i<processList.size();i++){
           List<CheckManage> checkManageList = processMapper.selectCheckById(processList.get(i).getProcessid());
           processList.get(i).setPartid(part.getPartid());//设置最新的partID
           processMapper.addPartProcess(processList.get(i));
            for(int j=0;j<checkManageList.size();j++){
                //System.out.println(checkManageList.get(j));
                checkManageList.get(j).setProcessid(processList.get(i).getProcessid());//更改将要插入的checktable的processID
                processMapper.addCheck(checkManageList.get(j));
            }
       }
    }

}
