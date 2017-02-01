package com.springmvc.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages="com.springmvc.proj")
@ImportResource("classpath:spring-config.xml")
public class WebprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebprojApplication.class, args);
	}
}
