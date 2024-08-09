package com.lordbao.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 17:35
 * @Version 1.0
 */
@Controller
@ResponseBody
@RequestMapping("cookie")
public class CookieController {
    @GetMapping("getCookie")
    public String getCookie(@CookieValue("cookieName") String cookieValue){
        System.out.println("cookieName:"+cookieValue);
        return "getCookie";
    }

    @GetMapping("addCookie")
    public String addCookie(HttpServletResponse response){
        response.addCookie(new Cookie("cookieName","handsome"));
        return "addCookie";
    }


}
