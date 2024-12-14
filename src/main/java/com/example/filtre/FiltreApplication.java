package com.example.filtre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FiltreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiltreApplication.class, args);
	}

}
