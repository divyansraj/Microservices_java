package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")// enable the jpa auditing and use the bean named auditAwareImpl to get the current auditor\
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info
				(title = "Accounts Microservice REST API Documentation", version = "1.0", description = "My Accounts Microservice REST API Documentation",
				contact = @Contact(
						name = "Divyanshu", email = "divyanshu@demo.com", url = "https://demo.com"
				),
						license = @License(
								name = "Apache 2.0", url = "https://demo.com/license"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "Accounts Microservice REST API Documentation", url = "https://demo.com"
		)
) // using this to generate the openapi documentation
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
