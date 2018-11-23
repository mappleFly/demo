package com.example.demo.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author lms
 * @Description 测试控制器
 **/
@Controller
public class FirstApplication {

    @RequestMapping("/index")
    String index(){
        return "demo";
    }

    public String getUserName(){
        return "lms:haha!";
    }
    /**
     * @Author lms
     * @Description @SpringBootApplication是Spring Boot 项目的核心注解
     * 主要目的是开启自动配置
     **/
    public static void main(String[] args){
        SpringApplication.run(FirstApplication.class,args);
    }
}
