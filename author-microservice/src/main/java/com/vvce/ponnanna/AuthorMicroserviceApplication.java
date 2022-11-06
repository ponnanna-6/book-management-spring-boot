package com.vvce.ponnanna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AuthorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorMicroserviceApplication.class, args);
	}

}
