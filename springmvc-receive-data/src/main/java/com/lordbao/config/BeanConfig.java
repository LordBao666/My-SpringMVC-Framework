package com.lordbao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 12:57
 * @Version 1.0
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.lordbao")
public class BeanConfig {
}
