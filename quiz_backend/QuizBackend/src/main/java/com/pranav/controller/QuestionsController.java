package com.pranav.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.dto.QuestionsDto;
import com.pranav.entity.Questions;
import com.pranav.repository.QuestionsRepository;
import com.pranav.utility.QuestionsService;



@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:4200")
public class QuestionsController {
	
	
	
	@Autowired
	private QuestionsService service;
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	@GetMapping("/questions")
	public List<QuestionsDto> getQuestions(){
		
		List<Questions> questionsList = service.getQuestions();
		
		return questionsList
				.stream()
				.map(question-> mapper.map(question, QuestionsDto.class))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/questions/{id}")
	
	public List<QuestionsDto> getCategorizedQuestions(@PathVariable("id") int id){
		List<Questions> questionsList = service.getCategorizeQuestions(id);
		
		return questionsList
				.stream()
				.map(question-> mapper.map(question, QuestionsDto.class))
				.collect(Collectors.toList());
	}

}
