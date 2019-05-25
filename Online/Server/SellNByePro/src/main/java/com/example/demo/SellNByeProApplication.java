package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo.Contoller"})
public class SellNByeProApplication {

	/*@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SellNByeProApplication.class);
    }*/
	
	public static void main(String[] args) {
		SpringApplication.run(SellNByeProApplication.class, args);
	}

	
}
