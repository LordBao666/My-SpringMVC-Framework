package com.lordbao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 16:55
 * @Version 1.0
 *
 * This class is to test @PathVariable
 */
@Controller
@ResponseBody
@RequestMapping("userpath")
public class UserPathController {


    @GetMapping("{id}")
    public String getUserById( @PathVariable Integer id){
        System.out.println(id);
        return "getUserById";
    }

}
