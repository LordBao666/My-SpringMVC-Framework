package com.lordbao.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lord_Bao
 * @Date 2024/8/13 12:04
 * @Version 1.0
 *
 * This controller is to test dynamic webpage response , redirect and forward
 */
@Controller
@RequestMapping("jsp")
public class JSPController {

    @GetMapping("index")
    public String index(String helloMessage, HttpServletRequest request){
        request.setAttribute("helloMessage",helloMessage);
        System.out.println("index is called");
        return "index";
    }

    @GetMapping("redirect")
    public String redirect(){
        System.out.println("redirect is called");
        return  "redirect:index";
//        return "redirect:https://www.baidu.com";
    }

    @GetMapping("forward")
    public String forward(String helloMessage){
        System.out.println("forward is called");
        return  "forward:index";
    }
}
