package com.vg.raiddataapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Raid Data API documentation",
		version = "1.0",
		description = "An unofficial API for Raid Shadow Legends",
		license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.txt"))
)
public class RaidDataApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RaidDataApiApplication.class, args);
	}
}
