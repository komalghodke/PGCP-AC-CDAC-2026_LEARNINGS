package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.beans.Product;

@Configuration
//@ComponentScan("com.demo")
@PropertySource("classpath:data.properties")
public class MySpringConfiguration {

	@Bean
	public Product getMyProduct() {
		System.out.println("In getMyproduct method @Bean");
		return new Product(12,"Shelf");
	}
}











