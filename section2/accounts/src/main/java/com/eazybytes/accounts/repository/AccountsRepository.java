package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    // JPA에서 스캔 불가능한 파생된 쿼리 메서드의 경우 작업 오류시 데이터를 롤백할 수 있도록 보호해야한다.
    // @Transactional 어노테이션을 명시해 메서드 실행 중에 오류가 발생하면 트랜잭션이 롤백
    // @Modifying 쿼리 메서드가 데이터베이스의 데이터를 수정(삭제 포함)하는 작업임을 명시
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}