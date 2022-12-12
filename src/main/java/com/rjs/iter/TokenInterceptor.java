package com.rjs.iter;

import com.alibaba.fastjson.JSON;
import com.rjs.vo.JsonResult;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//        System.out.println("preHandle...");
//        String token = request.getHeader("Token");//从请求头拿token
//        System.out.println(token);
//        if (token != null){
//            return true;
//        }
//        JsonResult jr = new JsonResult("没有登录",false);
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            response.setContentType("application/json;charset=utf-8");
//            PrintWriter out = response.getWriter();
//            out.write(JSON.toJSONString(jr));
//            out.flush();
//            return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion...");
    }
}
