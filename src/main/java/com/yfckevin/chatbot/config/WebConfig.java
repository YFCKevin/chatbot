package com.yfckevin.chatbot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://gurula.cc", "http://localhost:8099")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");

        registry.addMapping("/bingBao/**")
                .allowedOrigins("https://gurula.cc", "http://localhost:8098")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}