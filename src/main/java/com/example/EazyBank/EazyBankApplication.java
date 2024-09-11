package com.example.EazyBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
//@EnableJpaRepositories("com.example.EazyBank.repository")
//@EntityScan("com.example.EazyBank.model")
public class EazyBankApplication {
	public static void main(String[] args) {
		SpringApplication.run(EazyBankApplication.class, args);
	}
}