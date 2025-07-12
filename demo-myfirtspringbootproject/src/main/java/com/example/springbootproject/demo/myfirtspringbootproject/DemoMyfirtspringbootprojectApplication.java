package com.example.springbootproject.demo.myfirtspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//esht annotation me i rendesishem  ne nje projekt springboot
//vendosen zakonisht  mbi  klasen kryesore   te  app
//dhe kombinon 3 annotation e  tjera te springboot
//@SpringBootApplication = @Configuration +@EnableAutoConfiguration+@ComponentsScan


@SpringBootApplication
public class DemoMyfirtspringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMyfirtspringbootprojectApplication.class, args);
	}

}
