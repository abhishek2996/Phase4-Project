package com.pranav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.entity.Tags;

public interface CategoryRepository extends JpaRepository<Tags, Integer> {

}
