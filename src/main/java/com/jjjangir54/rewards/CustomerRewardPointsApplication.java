package com.jjjangir54.rewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jjjangir54.rewards")
public class CustomerRewardPointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRewardPointsApplication.class, args);
	}

}
