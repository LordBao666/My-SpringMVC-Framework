package com.lordbao.controller;

import com.lordbao.bean.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lord_Bao
 * @Date 2024/8/14 10:02
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping("register")
    public Map<String,Object> register(@Validated @RequestBody User user, BindingResult result){
        Map<String,Object> map = new HashMap<>();

        if(result.hasErrors()){
            map.put("code",400);
            map.put("msg","Parameter Validation Failure");
            map.put("data",null);
        }else {
            map.put("code",200);
            map.put("msg","Parameter Validation Success");
            map.put("data",user);
        }
        return map;
    }
}
