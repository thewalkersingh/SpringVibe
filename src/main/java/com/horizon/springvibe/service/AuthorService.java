package com.horizon.springvibe.service;

import com.horizon.springvibe.entity.Author;

import java.util.List;

public interface AuthorService {
	
	List<Author> findAll();
	
	int countByAgeGreaterThan(int age);
	
	List<Author> findAllByLastName(String lastName);
	
	List<Author> findAllByFirstName(String firstName);
	
	List<Author> findAllByFirstNameIgnoreCase(String firstName);
	
	int updateAuthorAge(int id, int age);
	
}