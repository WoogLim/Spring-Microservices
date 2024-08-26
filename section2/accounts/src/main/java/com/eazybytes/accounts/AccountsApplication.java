package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// SpringBootApplication 를 이용할 수 있음을 명시한 데코레이터 beans 등이 포함됨.
// @EnableJpaAuditing Spring Data JPA에서 감사 기능을 활성화 auditorAwareRef bean 명을 명시해 사용 AuditAwareImpl 을 사용함.
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
