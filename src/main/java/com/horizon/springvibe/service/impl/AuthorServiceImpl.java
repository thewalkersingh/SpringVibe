package com.horizon.springvibe.service.impl;

import com.horizon.springvibe.entity.Author;
import com.horizon.springvibe.repository.AuthorRepository;
import com.horizon.springvibe.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	private final AuthorRepository authorRepository;
	
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}
	
	@Override
	public int countByAgeGreaterThan(int age) {
		return authorRepository.countByAgeGreaterThan(age);
	}
	
	@Override
	public List<Author> findAllByLastName(String lastName) {
		return authorRepository.findAllByLastName(lastName);
	}
	
	@Override
	public List<Author> findAllByFirstName(String firstName) {
		return authorRepository.findAllByFirstName(firstName);
	}
	
	@Override
	public List<Author> findAllByFirstNameIgnoreCase(String firstName) {
		return authorRepository.findAllByFirstNameIgnoreCase(firstName);
	}
	
	@Override
	public int updateAuthorAge(int id, int age) {
		return authorRepository.updateAuthorAge(id, age);
	}
	
}