package com.v1.Pv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.v1.Pv1.controller"})
@SpringBootApplication
public class Pv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Pv1Application.class, args);
	}

}
