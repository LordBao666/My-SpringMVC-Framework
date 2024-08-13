package com.lordbao.controller;

import com.lordbao.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/8/13 15:25
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public List<User> page(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println("page");
        System.out.println(page);
        System.out.println(size);
        return null;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        System.out.println("addUser");
        System.out.println(user);
        return  new User(1,"king",33);
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable int id){
        System.out.println("getUser");
        System.out.println(id);
        return  new User(2,"rose",22);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        System.out.println("updateUser");
        System.out.println(user);
        return  new User(3,"fake",11);
    }

    @DeleteMapping("{id}")
    public User deleteUser(@PathVariable int id){
        System.out.println("deleteUser");
        System.out.println(id);
        return  new User(3,"fake",11);
    }

    @GetMapping("search")
    public List<User> searchUserByKeyName(@RequestParam(required = false,defaultValue = "1") int page,
                                          @RequestParam(required = false,defaultValue = "10") int size,
                                          @RequestParam String keyword){
        System.out.println("searchUserByKeyName");
        System.out.println(page);
        System.out.println(size);
        System.out.println(keyword);
        return  null;
    }
}
