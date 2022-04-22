package com.bootcamp.cicdapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCdApiTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(CiCdApiTestApplication.class, args);
		System.out.println("http://localhost:3000/api/test");

	}

}
