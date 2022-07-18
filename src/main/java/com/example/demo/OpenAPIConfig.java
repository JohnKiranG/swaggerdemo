package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL") })
@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI config() {
		return new OpenAPI().info(
				new Info().title("Demo REST API").description("OpenApi Documentation for Demo Project").version("v1")
		);
	}

}
