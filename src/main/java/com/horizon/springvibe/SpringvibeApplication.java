package com.horizon.springvibe;

import com.horizon.springvibe.entity.Author;
import com.horizon.springvibe.repository.AuthorRepository;
import com.horizon.springvibe.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
	
	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository) {
		return args -> {
			/*for (int i = 1; i <= 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
						             .firstName(faker.name().firstName())
						             .lastName(faker.name().lastName())
						             .age(faker.number().numberBetween(20, 50))
						             .email("dummy" + i + "mail@email.com")
						             .build();
				authorRepository.save(author);
			}*/
/*			var video = Video.builder()
					            .name("Spring Boot Application")
					            .length(20)
					            .build();
			videoRepository.save(video);*/
			
			// updating a whole entity
			var author = Author.builder()
			                   .firstName("Harry")
			                   .lastName("Potter")
			                   .age(33)
			                   .email("harry@email.com")
			                   .build();
//			authorRepository.save(author);
			
			// update certain field
			authorRepository.updateAuthorAge(2, 44);
		};
	}
	
}