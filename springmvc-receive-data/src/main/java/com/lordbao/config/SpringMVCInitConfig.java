package com.lordbao.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author Lord_Bao
 * @Date 2024/8/9 12:58
 * @Version 1.0
 */

public class SpringMVCInitConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 指定service / mapper层的配置类
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * 指定springmvc的配置类
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BeanConfig.class};
    }

    /**
     * 设置dispatcherServlet的处理路径!
     * 一般情况下为 / 代表处理所有请求!
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
