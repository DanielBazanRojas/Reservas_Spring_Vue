package com.dwi.backend.Config;

import org.springframework.context.annotation.Bean;

public interface WebMvcConfigurer {
    @Bean
    org.springframework.web.servlet.config.annotation.WebMvcConfigurer corsConfigurer();
}
