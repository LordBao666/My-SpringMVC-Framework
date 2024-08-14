package com.lordbao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Lord_Bao
 * @Date 2024/8/14 9:03
 * @Version 1.0
 */
@Controller
public class TestController {

    @ResponseBody
    @GetMapping("test")
    public String testInterceptor1(){

        return "TestController.testInterceptor1";
    }

    @ResponseBody
    @GetMapping("images/**")
    public String testInterceptor2(){

        return "TestController.testInterceptor2";
    }
}
