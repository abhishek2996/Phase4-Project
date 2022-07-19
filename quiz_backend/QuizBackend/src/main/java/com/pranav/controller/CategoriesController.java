package com.pranav.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.dto.TagsDto;
import com.pranav.entity.Tags;
import com.pranav.repository.CategoryRepository;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:4200")
public class CategoriesController {
	
	private final CategoryRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	
	public CategoriesController(CategoryRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/categories")
	public List<TagsDto> getTags(){
		List<Tags> tags = repo.findAll();
		
		for(var tag : tags) {
			System.out.println(tag.getImageUrl());
		}
		
		return tags.stream()
				.map(tag -> mapper.map(tag, TagsDto.class))
				.collect(Collectors.toList());
	}
	

}
