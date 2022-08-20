package com.dev.webhelpdeskapp;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WebHelpDeskAppApplication  {
	public static void main(String[] args) {
		SpringApplication.run(WebHelpDeskAppApplication.class, args);
	}
}
