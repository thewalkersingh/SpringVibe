package com.horizon.springvibe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
// @Table(name = "AUTHOR_TBL")
public class Author {
	
	@Id
	@GeneratedValue
	/*(
					strategy = GenerationType.TABLE,
					generator = "author_sequence"
	)*/
	/*
	@SequenceGenerator(
			name = "author_sequence",
			sequenceName = "author_sequence",
			allocationSize = 1
	)*/
	// or
	/*@TableGenerator(
			name = "author_id_gen",
			table = "id_generator",
			pkColumnName = "id_name",
			valueColumnName = "id_value",
			allocationSize = 1
	)*/
	private Integer id;
	
	@Column(name = "f_name ", length = 50)
	private String firstName;
	private String lastName;
	
	@Column(unique = true, nullable = false)
	private String email;
	private int age;
	
	@Column(updatable = false, nullable = false)
	private LocalDateTime createdAt;
	
	@Column(insertable = false, nullable = false)
	private LocalDateTime lastModified;
	
}