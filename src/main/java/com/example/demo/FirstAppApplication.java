package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {
	private static int a=10;

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		
		System.out.println(a);
		System.out.println("I am here");
		System.out.println("look");
	}

}
