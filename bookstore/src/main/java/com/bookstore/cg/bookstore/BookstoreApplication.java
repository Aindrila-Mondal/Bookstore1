package com.bookstore.cg.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories(basePackages="com.cg.*")
@EntityScan(basePackages="com.cg.*")
@ComponentScan(basePackages="com.cg.*")
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}

