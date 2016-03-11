package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.faces.webflow.JsfView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity")
public class AppConfiguration {

    @Bean
    public ViewResolver viewResolver() {
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(JsfView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".xhtml");

        return viewResolver;
    }

}