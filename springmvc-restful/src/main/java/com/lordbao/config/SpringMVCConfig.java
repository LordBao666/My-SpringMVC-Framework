package com.lordbao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author Lord_Bao
 * @Date 2024/8/13 15:26
 * @Version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.lordbao.controller")
public class SpringMVCConfig {
}
