package com.lordbao.config;

import com.lordbao.interceptor.GeneralInterceptor;
import com.lordbao.interceptor.ImgInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Lord_Bao
 * @Date 2024/8/14 8:45
 * @Version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.lordbao")
public class BeanConfig implements WebMvcConfigurer {



//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//       //intercept requests to visit images
//       registry.addInterceptor(new ImgInterceptor())
//               .addPathPatterns("/images/**");
//
//       //intercept all requests.
//       registry.addInterceptor(new GeneralInterceptor());
//    }
}
