package com.geff.nopmocounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class NopmocounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NopmocounterApplication.class, args);
	}

}
