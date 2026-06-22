package com.horizon.springvibe.repository;

import com.horizon.springvibe.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}