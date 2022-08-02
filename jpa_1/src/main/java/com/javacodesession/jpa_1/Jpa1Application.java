package com.javacodesession.jpa_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.javacodesession.jpa_1.service.ProductServiceImpl")
public class Jpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpa1Application.class, args);
	}

}
