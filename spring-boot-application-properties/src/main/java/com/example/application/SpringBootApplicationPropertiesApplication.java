package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
@Configuration
//@PropertySource({ "file:E:\\conf\\test.properties", "file:E:\\conf\\temp.properties"})
@PropertySources({ @PropertySource( "file:E:\\conf\\test.properties"),@PropertySource ("file:E:\\conf\\temp.properties") })
@SpringBootApplication
public class SpringBootApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationPropertiesApplication.class, args);
	}
}
