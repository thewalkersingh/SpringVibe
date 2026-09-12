package com.horizon.springvibe.controller;

import com.horizon.springvibe.entity.Author;
import com.horizon.springvibe.service.AuthorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
@Tag(name = "Author", description = "Author management endpoints")
public class AuthorController {
	
	private final AuthorService authorService;
	
	@GetMapping
	public List<Author> findAll() {
		return authorService.findAll();
	}
	
	@GetMapping("/firstName")
	public List<Author> findFirstName(String firstName) {
		return authorService.findAllByFirstName(firstName);
	}
	
	@GetMapping("/{age}")
	public int countByAgeGreaterThan(@PathVariable int age) {
		return authorService.countByAgeGreaterThan(age);
	}
	
}