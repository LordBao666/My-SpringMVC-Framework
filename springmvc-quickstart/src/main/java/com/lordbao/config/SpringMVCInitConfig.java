package com.lordbao.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author Lord_Bao
 * @Date 2024/8/5 12:02
 * @Version 1.0
 *
 *  AbstractAnnotationConfigDispatcherServletInitializer是 SpringMVC 提供的一个类，我们可以写一个子类并在该子类进行适当的配置，
 *  其效果可以完全替代web.xml，更方便实现完全注解方式ssm处理!
 *  1.通过getRootConfigClasses()方法 指定 service/mapper层的配置类，这些配置类涉及的组件将由一个叫做 AnnotationConfigWebApplicationContext
 *  的容器管理. 通俗来讲，这里配置的组件就是我们之前在学习Spring框架时涉及的组件.
 *  2.通过getServletConfigClasses()方法 指定SpringMVC 相关的配置类，比如配置HandlerMapping,HandlerAdapter,ViewResolver等，
 *  这些组件 又 单独由另外一个 AnnotationConfigWebApplicationContext 容器管理.
 *  两个容器管理不同的组件本质还是为了区分方便，可查看AbstractAnnotationConfigDispatcherServletInitializer的原码来验证双容器管理.
 *
 *  3.getServletMappings 用于配置DispatcherServlet的处理路径，我们一般都设置为 /，这表示dispatcherServlet 将处理所有请求.
 *  如果你学过JavaWeb，将dispatcherServlet 理解为普通的Servlet就行，而Servlet都是要设置相应的请求路径的.
 */

public class SpringMVCInitConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 指定service / mapper层的配置类. 在学习SpringMVC的过程中，我们不引入service 和 mapper.
     * 故而这里暂时未用.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * 指定springmvc的配置类，在该配置类中，可以配置HandlerMapping,HandlerAdapter,ViewResolver
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
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
