package org.jesperancinha.std.mastery3.plants.configuration;

import org.jesperancinha.std.mastery3.plants.controller.GeneralExceptionResolver;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.ServletContext;

@Configuration
public class WebConfig implements WebMvcConfigurer, ApplicationContextAware, ServletContextAware {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public HandlerExceptionResolver handlerExceptionResolver2() {
        SimpleMappingExceptionResolver resolver = new GeneralExceptionResolver();
        resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return resolver;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {

    }
}