package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// 이 인터페이스는 Spring Data JPA에서 JPA 리포지토리 역할을 합니다.
// JpaRepository 인터페이스를 상속받아 기본적인 CRUD (Create, Read, Update, Delete)
// 및 페이징 기능을 제공합니다. 제네릭 타입으로 엔티티 클래스 (Customer)와
// 그 기본 키의 타입 (Long)을 명시합니다.
// 이 인터페이스는 구현 클래스 없이도 Spring에 의해 자동으로 빈(bean)으로 등록되어,
// 데이터베이스 작업을 수행할 수 있습니다.
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // 파생된 쿼리 메서드
    // 메서드 이름을 기반으로 Spring Data JPA가 자동으로 SQL 쿼리를 생성
    // findBy 로 시작하는 메서드는 특정 조건에 맞는 데이터를 검색하는 쿼리를 생성
    // MobileNumber는 Customer 엔티티의 mobileNumber 필드를 기준으로 검색한다는 의미
    // Optional<Customer> 타입을 반환하므로, 검색 결과가 없을 경우 Optional.empty()가 반환되고, 결과가 있을 경우 Optional에 포함된 Customer 객체가 반환
    Optional<Customer> findByMobileNumber(String mobileNumber);

}