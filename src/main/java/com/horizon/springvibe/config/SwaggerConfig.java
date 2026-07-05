package com.horizon.springvibe.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
	
	@Value("${server.port:8080}")
	private int serverPort;
//	private static final String SECURITY_SCHEME_NAME = "bearerAuth";
	
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				       .info(new Info().title("Testing Service API")
						             .description("Handles All type of Request")
						             .version("1.0.0")
						             .contact(new Contact()
								                      .name("Test_Company")
								                      .email("dev@example.com")))
				       .servers(List.of(new Server()
						                        .url("http://localhost:" + serverPort)
						                        .description("Local development server")));
		// ── JWT security scheme ──────────────────────
				       /*.addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
				       .components(new Components().addSecuritySchemes(SECURITY_SCHEME_NAME,
						       new SecurityScheme().name(SECURITY_SCHEME_NAME).type(SecurityScheme.Type.HTTP)
								       .scheme("bearer")
								       .bearerFormat("JWT")
								       .description("Paste your JWT access token here")));*/
	}
	
}