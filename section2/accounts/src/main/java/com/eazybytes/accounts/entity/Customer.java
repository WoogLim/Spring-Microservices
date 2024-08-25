package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

//@Table(name = "customer")
@Entity
// Lombok 에서 지원하는 생성자를 이용할 것이므로 AllArgsConstructor, NoArgsConstructor 설정
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity{

    // 이 필드는 데이터베이스의 기본 키(PK)로 설정됩니다.
    // 자동 생성 전략을 사용하여 기본 키를 생성합니다.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    // Hibernate에서 제공하는 "native" 전략을 사용하여 기본 키를 생성합니다.
    @GenericGenerator(name="native", strategy = "native")
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

}
