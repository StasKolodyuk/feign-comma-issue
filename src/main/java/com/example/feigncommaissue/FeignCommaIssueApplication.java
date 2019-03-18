package com.example.feigncommaissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignCommaIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignCommaIssueApplication.class, args);
	}
}
