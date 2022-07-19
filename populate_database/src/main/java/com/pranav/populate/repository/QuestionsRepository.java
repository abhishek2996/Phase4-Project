package com.pranav.populate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.populate.entity.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

}
