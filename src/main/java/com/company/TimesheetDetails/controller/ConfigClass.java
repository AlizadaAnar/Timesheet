package com.company.TimesheetDetails.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigClass implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")  // Allow all origins. You may restrict it to specific origins.
                .allowedMethods("PUT", "POST", "GET", "OPTIONS", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);  // Max age for pre-flight requests (in seconds)
    }
}
