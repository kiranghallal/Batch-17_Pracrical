package com.Maven_Apr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Maven_Apr.add.Sum;

@SpringBootApplication
public class MavenAprApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenAprApplication.class, args);
		
		System.out.println("Hello Kiran I Hope You Are Doing Great !!!!");
		
		int addition = new Sum().addition(20, 35);
		System.out.println(addition);
		
	}

}
