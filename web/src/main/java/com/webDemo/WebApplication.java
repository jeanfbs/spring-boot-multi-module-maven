package com.webDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * since basePackage includes com.apiDemo.* and api module is imported, api components will also be invoked.
 */
@Configuration
@ComponentScan(basePackages = "com.*")
@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
}
