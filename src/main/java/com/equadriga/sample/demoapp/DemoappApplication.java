package com.equadriga.sample.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ={"com.equadriga.sample"})
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}

}
