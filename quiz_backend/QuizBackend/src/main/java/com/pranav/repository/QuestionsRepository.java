package com.pranav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pranav.entity.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

	@Query(
			value="Select * from Questions u where u.tag_id = :id", nativeQuery = true
			)
	List<Questions> getCategorizedQuestions(@Param("id") int id);
}
