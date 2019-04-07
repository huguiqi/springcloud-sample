package com.example.cloudserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableAdminServer
public class BootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminServerApplication.class, args);
	}
}
