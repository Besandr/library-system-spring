package com.besandr.config;

import com.besandr.repository.entities.Languages;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@EnableWebMvc
@ComponentScan({
        "com.howtodoinjava.web",
        "com.besandr.web.controllers",
        "com.besandr.services"})
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("titlePage");
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolverBean = new InternalResourceViewResolver();
        resolverBean.setPrefix("/WEB-INF/jsp/");
        resolverBean.setSuffix(".jsp");
        resolverBean.setExposeContextBeansAsAttributes(true);
        return resolverBean;
    }

    @Bean
    public List<Languages> languages(){
        return Stream
                .of(Languages.ENGLISH, Languages.RUSSIAN, Languages.UKRAINIAN)
                .collect(Collectors.toList());
    }

    @Bean
    public String language(){
        return Languages.ENGLISH.getCode();
    }

}
