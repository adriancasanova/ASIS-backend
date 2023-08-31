package com.asis.ayco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AycoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AycoApplication.class, args);
                
	}

}
