package com.pranav;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pranav.utility.QuestionsService;

@SpringBootApplication
public class QuizBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizBackendApplication.class, args);
	}

	
	@Bean
	public ModelMapper getMapper() {
		return new ModelMapper();
	}
	
	
}
