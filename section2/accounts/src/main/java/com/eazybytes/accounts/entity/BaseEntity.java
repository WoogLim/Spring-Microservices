package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

// JPA 프레임워크에서 지원. 슈퍼클래스로 작동할 것임을 명시
// @EntityListeners 리스너는 엔티티의 상태 변경을 감지하여 해당 이벤트가 발생할 때 특정 메서드를 호출
// AuditingEntityListener.class 는 JPA에서 제공하는 리스너 클래스 티티의 생성 및 수정 시 자동으로 필드(예: createdAt, updatedAt 등)에 타임스탬프를 설정하는 역할
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @ToString
public class BaseEntity {
    // Lombok의 @Getter, @Setter, @ToString 애노테이션은 각각의 필드에 대해
    // getter, setter 메서드와 toString 메서드를 자동으로 생성합니다.
    // 이는 상속과 유사한 효과를 가지며, 필요시 메서드를 재정의할 수 있습니다.

    // @CreatedDate 레코드 생성시 자동으로 날짜 입력
    // 생성 시점의 값을 저장하며, 이후 업데이트되지 않도록 설정합니다.
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    // 생성 시점에는 삽입되지 않고 수정 시에만 업데이트됩니다.
    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    // @LastModifiedDate 레코드 수정시 자동으로 날짜 입력
    // 엔티티를 마지막으로 수정한 사용자의 정보를 저장하며,
    // 생성 시점에는 삽입되지 않고 수정 시에만 업데이트됩니다.
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;
}
