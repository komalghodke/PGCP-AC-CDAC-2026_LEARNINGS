package com.demo.MySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication    //@Configuration, @EnableMVC @ComponentScan
public class MySpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MySpringBootApplication.class, args);
		/*for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
