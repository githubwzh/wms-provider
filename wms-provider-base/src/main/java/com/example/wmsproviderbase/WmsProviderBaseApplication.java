package com.example.wmsproviderbase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WmsProviderBaseApplication implements CommandLineRunner {
	@Override
	public void run(String... strings) throws Exception {

	}

	public static void main(String[] args) {
		SpringApplication.run(WmsProviderBaseApplication.class, args);
	}
}
