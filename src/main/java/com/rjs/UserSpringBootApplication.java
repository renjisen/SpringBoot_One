package com.rjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@MapperScan("com.rjs.mapper")//注解包扫描
public class UserSpringBootApplication {
        public static void main(String[] args) {
            System.setProperty("spring.devtools.restart.enabled","false");//关闭热部署
            SpringApplication application = new SpringApplication(UserSpringBootApplication.class);
            application.run(args);
        }
}
