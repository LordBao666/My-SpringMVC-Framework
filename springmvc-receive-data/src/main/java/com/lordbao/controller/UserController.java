package com.lordbao.controller;

import com.lordbao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 12:50
 * @Version 1.0
 *
 * This class is to test @RequestParameter,@RequestBody
 */
@Controller
@RequestMapping("user")
@ResponseBody //@ResponseBody  can add to class or method. Adding to class is like adding to all methods of the class.
public class UserController {

    //@RequestParam is a very important annotation when receiving data by params.
    //For more details,check the notes
    @GetMapping("getUserById")
    public String getUserById( Integer id){
        System.out.println(id);
        return "getUserById";
    }

    //When receiving multiple variables of the same name, you have
    //to add @RequestParam annotation.
    @GetMapping("getUsersByNames")
    public String getUsersByNames(@RequestParam List<String> names){
        System.out.println(names);
        return "getUsersByNames";
    }

    //@RequestBody is a very important annotation when receiving data by json.
    //For more details,check the notes
    @PostMapping("addUser")
    public String addUser(@RequestBody User user){
        System.out.println(user);
        return "addUser";
    }


}
