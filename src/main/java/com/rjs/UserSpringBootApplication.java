package com.rjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;

@SpringBootApplication
@MapperScan("com.rjs.mapper")
public class UserSpringBootApplication {
        public static void main(String[] args) {

            SpringApplication.run(UserSpringBootApplication.class,args);
        }
}
