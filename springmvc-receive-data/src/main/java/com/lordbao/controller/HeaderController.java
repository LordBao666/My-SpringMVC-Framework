package com.lordbao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 17:48
 * @Version 1.0
 */
@Controller
@ResponseBody
@RequestMapping("header")
public class HeaderController {

    @GetMapping("/host")
    public String getHeader(@RequestHeader("Host")String host){
        System.out.println(host);
        return  "getHeader";
    }
}
