package com.company.TimesheetDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
public class TimesheetDetailsApplication implements WebMvcConfigurer{

    public static void main(String[] args) {
        SpringApplication.run(TimesheetDetailsApplication.class, args);
    }

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS").allowedOrigins("http://localhost:5175");
//			}
//		};
//	}


	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:5175")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowCredentials(true);
	}


}
