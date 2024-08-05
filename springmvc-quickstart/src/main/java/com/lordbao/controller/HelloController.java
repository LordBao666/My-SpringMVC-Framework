package com.lordbao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Lord_Bao
 * @Date 2024/8/5 11:58
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("springmvc/hello")
    @ResponseBody
    public String helloSpringMVC(){
        System.out.println("Hello Spring MVC");
        return "Hello Spring MVC";
    }

}
