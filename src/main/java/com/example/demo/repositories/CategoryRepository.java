package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {}
