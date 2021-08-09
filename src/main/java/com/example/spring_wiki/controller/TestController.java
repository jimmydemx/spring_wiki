package com.example.spring_wiki.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// RestController用来返回字符串
@RestController
public class TestController {
    // path/hello 为其第一个接口
    /*
    *   GET, POST ,PUT, DELETE
    *   non-Restful: /user/?id=1
    *   Restful: /user/1
    *   @return
    * */
    @RequestMapping("/hello")
    public String hello(){

        return "hello world!";

    }
}
