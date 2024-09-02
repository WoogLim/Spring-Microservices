package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.Locale;

// SpringBootApplication 를 이용할 수 있음을 명시한 데코레이터 beans 등이 포함됨.
// @EnableJpaAuditing Spring Data JPA에서 감사 기능을 활성화 auditorAwareRef bean 명을 명시해 사용 AuditAwareImpl 을 사용함.
@SpringBootApplication
// 다른 패키지를 사용하는 경우 아래 구문을 작성해 문서에 포함시킬 수 있다.
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller")})
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info = @Info(
		title = "Accounts microservice REST API Documentation",
		description = "Accounts microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
			name = "woog",
			email = "elegy74@gmail.com",
			url = "https://wooglim.dev"
		),
		license = @License(
			name = "Apache 2.0",
			url = "https://wooglim.dev"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "Accounts microservice REST API Documentatio",
		url = "https://wooglim.dev"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
