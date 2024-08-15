package com.lordbao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Lord_Bao
 * @Date 2024/8/13 11:45
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.lordbao.controller")
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {


    /**
     * Configure View Resolver.
     * Here we only take jsp  for example, other templates like thymeleaf
     * work alike.
     * The prefix is  /WEB-INF/views/, the suffix is .jsp, so when you visit index,
     * the view resolver will concatenate it into  /WEB-INF/views/index.jsp.
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
    }

    /**
     * configure Default Servlet Handling.
     * If you want to visit static resources in your project, you need to add
     * the code below.
     * The request process is as follows:
     * first the DispatcherServlet will send the request to the HandlerMapping,
     * then HandlerMapping will check if there is a handler to deal with this
     * request, if not , the HandlerMapping will ask the DefaultServletHandler to
     * handle this request.
     *
     * NOTE that if you want the DefaultServletHandler to work ,you need to add the code
     * below, or HandlerMapping find no handler and report 404 error.
     *
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
