package com.open.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启Spring Cloud Security权限注解
public class ManageAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageAuthApplication.class, args);
	}

}
