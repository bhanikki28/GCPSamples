package com.nikki.gcp.demo.AppEngineDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nikki")
public class AppEngineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEngineDemoApplication.class, args);
	}

}
