package com.rjs.control.userControl;

import com.rjs.Util.CodeUtil;
import com.rjs.service.userService.UserServiceInf;
import com.rjs.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/Code")
public class CodeController {

    private final static Logger logger =  LoggerFactory.getLogger(CodeController.class);
    private String random = null;
    /**
     * 生成验证码
     */
    @GetMapping("getVerify")
    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            CodeUtil randomValidateCode = new CodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
            random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            System.out.println(random);
        } catch (Exception e) {
            e.printStackTrace();
//            logger.error("获取验证码失败>>>>   ", e);
        }
    }

    /**
     * 校验验证码
     */
    @RequestMapping(value = "/checkVerify")
    @CrossOrigin
    @ResponseBody
    public boolean checkVerify(@RequestBody User user) {
        try{
            //从session中获取随机数
            String inputStr = user.getCode();
            if (random == null) {
                return false;
            }
            if (random.equals(inputStr)) {
                System.out.println(123);
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
//            logger.error("验证码校验失败", e);
            return false;
        }
    }
    @RequestMapping(value = "/getsession")
    @CrossOrigin
    public String getsession(HttpSession session){
        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
        System.out.println(random);
        return random;
    }
}
