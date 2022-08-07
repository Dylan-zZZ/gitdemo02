package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/*@ResponseBody-->返回的字符串作为字符串而不是网址
@Controller*/

@RestController//相当于以上两个注解
public class Hellocontroller {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String testHello(@RequestParam(name = "name") String name){
        return "hello"+"你好"+name;
    }
}
