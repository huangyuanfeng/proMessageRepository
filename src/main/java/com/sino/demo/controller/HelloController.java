package com.sino.demo.controller;

import com.sino.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 这里使用的是RestController
 * 如果不是前后端分离提供API接口，可以使用Controller（使用JSP或html页面）
 * 防止打包没添加jsp等资源，需要在POM.xml进行配置
 */
@RestController
@RequestMapping(value = "/helloWorld")
public class HelloController
{
    @Autowired
//    @Qualifier("helloService")  //起别名，防止其他类也在使用？
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello()
    {
        String id = "1";
        helloService.helloWorld("admin");
        return "hello";
    }
}
