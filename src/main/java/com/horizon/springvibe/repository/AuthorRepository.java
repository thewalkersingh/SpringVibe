package com.horizon.springvibe.repository;

import com.horizon.springvibe.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	int countByAgeGreaterThan(int age);
	
	List<Author> findAllByLastName(String lastName);
	
	List<Author> findAllByFirstName(String firstName);
	
	List<Author> findAllByFirstNameIgnoreCase(String firstName);
	
	@Modifying
	@Transactional
	@Query("update Author a set a.age=:age where a.id=:id")
	int updateAuthorAge(int id, int age);
	
}