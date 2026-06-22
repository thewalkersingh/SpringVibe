package com.horizon.springvibe;

import com.horizon.springvibe.entity.Author;
import com.horizon.springvibe.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringvibeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringvibeApplication.class, args);
		System.out.println("***************************************************************");
		System.out.println("*****************-------------------------*********************");
		System.out.println("****************| Spring Boot App Started |********************");
		System.out.println("*****************-------------------------*********************");
		System.out.println("***************************************************************");
	}
	
	// @Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
		return args -> {
			var author = Author.builder()
					             .firstName("Harry")
					             .lastName("Potter")
					             .email("harry@email.com")
					             .age(22)
					             .createdAt(LocalDateTime.now().minusDays(1))
					             .lastModified(LocalDateTime.now().plusDays(1))
					             .build();
			authorRepository.save(author);
		};
	}
	
}