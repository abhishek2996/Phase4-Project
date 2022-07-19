package com.pranav.utility;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pranav.dto.QuestionsDto;
import com.pranav.entity.Questions;
import com.pranav.repository.QuestionsRepository;

@Service
public class QuestionsService{
	
	private final QuestionsRepository repo;
	
	public QuestionsService(QuestionsRepository repo) {
		this.repo = repo;
	}
	
	
	public List<Questions> getQuestions(){
			
			return repo.findAll();
			
	}
	
	public List<Questions> getCategorizeQuestions(int id){
		
		return repo.getCategorizedQuestions(id);
	}

}
