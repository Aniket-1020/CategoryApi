package com.ecommercewebsite.ecommerce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository"})


public class Ecommerce1Application{

	public static void main(String[] args) {
		SpringApplication.run(Ecommerce1Application.class, args);
	}
}
