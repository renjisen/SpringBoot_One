package com.rjs.control;

import com.rjs.service.DownFileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/downFile")
public class DownFileController {
    @Resource
    private DownFileService downFileService;

    @RequestMapping("/downLoadFile")
    @CrossOrigin
    public void downLoadFile(@RequestParam("path") String path, @RequestParam("name") String name, HttpServletResponse response) throws Exception {
        downFileService.downLoadFile(path,name,response);
    }
}
