package com.zhanghai.cglib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CglibApplication {

	public static void main(String[] args) {
		SpringApplication.run(CglibApplication.class, args);
	}

}
