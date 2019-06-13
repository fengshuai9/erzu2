package com.cn.controller;


import com.cn.model.TestBean;
import com.cn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {


    @Autowired
    private TestService testService;

    @RequestMapping("toTest")
    public String toTest(){

        System.out.println("fs22222222");
        System.out.println("333333");

        return "test";
    }


    @RequestMapping("queryTest")
    @ResponseBody
    public List<TestBean> queryTest(){
      List<TestBean> list= testService.queryTest();
      return list;
    }






}
