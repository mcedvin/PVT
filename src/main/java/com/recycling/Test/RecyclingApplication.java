package com.recycling.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.recycling.DB.repository")
@EntityScan(basePackages = {"com.recycling.recycling.production"})
//@EnableJpaRepositories(basePackages = "com.recycling.Test.repository")

//@ComponentScan(basePackages = {"com.recycling.Test.Controller"})
@SpringBootApplication


public class RecyclingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecyclingApplication.class, args);
	}

}
