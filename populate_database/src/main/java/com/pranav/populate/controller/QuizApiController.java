package com.pranav.populate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pranav.populate.entity.Answers;
import com.pranav.populate.entity.Options;
import com.pranav.populate.entity.Questions;

import com.pranav.populate.repository.QuestionsRepository;
import com.pranav.populate.utility.Question;


@Controller
@RequestMapping("/quiz")
public class QuizApiController {
	
	@Autowired
	private QuestionsRepository repository;
	
	@GetMapping("/")
	public String getQuiz() throws JsonMappingException, JsonProcessingException {
		
		Questions questions;
		Options options;
	
		Answers answers;
		 
		 ObjectMapper mapper = new ObjectMapper();
		
		String uri = "https://quizapi.io/api/v1/questions?category=Bash";
		RestTemplate template = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Api-Key", "NBhDHgLiqD0LlElYxHm7Xf4pjgIdhmzYtUWgfW62");
		headers.set("limit", "100");
		
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		var response = template.exchange(uri, HttpMethod.GET, entity,String.class).getBody();
		

		Question[] question = mapper.readValue(response, Question[].class);
		
		
		
		for(var a : question) {
			System.out.println(a);
			options = new Options(a.getId(),a.getOptions().getAnswer_a(),a.getOptions().getAnswer_b(),a.getOptions().getAnswer_c(),
					a.getOptions().getAnswer_d(),a.getOptions().getAnswer_e(),a.getOptions().getAnswer_f());
			
			answers = new Answers( a.getId(),a.getCorrectAnswers().isAnswer_a_correct(), a.getCorrectAnswers().isAnswer_b_correct(),
					a.getCorrectAnswers().isAnswer_c_correct(),a.getCorrectAnswers().isAnswer_d_correct(),a.getCorrectAnswers().isAnswer_e_correct(),
					a.getCorrectAnswers().isAnswer_f_correct());
			questions = new Questions(a.getId(),a.getQuestion(), a.getDescription(),options, a.isMultipleAnswers(),a.getCorrectAnswer(),
					answers,	a.getExplanation(),a.getTip(),a.getCategory(),a.getDifficulty());
			
			repository.save(questions);
		}
		
		//System.out.println(response);
		
		return "index";
		
	}

}
