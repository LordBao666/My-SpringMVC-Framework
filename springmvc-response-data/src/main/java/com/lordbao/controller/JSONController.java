package com.lordbao.controller;

import com.lordbao.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Lord_Bao
 * @Date 2024/8/13 12:29
 * @Version 1.0
 */
@RestController // @RestController =  @ResponseBody + Controller
@RequestMapping("json")
public class JSONController {

    @GetMapping("hello")
    public String hello(){
        return  "hello";
    }

    @GetMapping("user")
    public User getUser(){
        return  new User("jack",22);
    }

    @GetMapping("userlist")
    public List<User> getUserList(){
        List<User> list = new ArrayList<>();
        list.add(new User("jack",22));
        list.add(new User("tom",21));
        return list;
    }

    @GetMapping("usermap")
    public Map<Integer,User> getUserMap(){
        Map<Integer,User> map = new HashMap<>();
        map.put(1,new User("jack",22));
        map.put(2,new User("tom",21));

        return map;
    }
}
