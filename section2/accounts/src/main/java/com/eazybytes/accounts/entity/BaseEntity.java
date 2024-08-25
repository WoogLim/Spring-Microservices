package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// JPA 프레임워크에서 지원. 슈퍼클래스로 작동할 것임을 명시
@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {
    // Lombok의 @Getter, @Setter, @ToString 애노테이션은 각각의 필드에 대해
    // getter, setter 메서드와 toString 메서드를 자동으로 생성합니다.
    // 이는 상속과 유사한 효과를 가지며, 필요시 메서드를 재정의할 수 있습니다.

    // 생성 시점의 값을 저장하며, 이후 업데이트되지 않도록 설정합니다.
    @Column(updatable = false)
    private LocalDateTime createdAt;

    // 생성 시점에는 삽입되지 않고 수정 시에만 업데이트됩니다.
    @Column(updatable = false)
    private String createdBy;

    // 엔티티를 마지막으로 수정한 사용자의 정보를 저장하며,
    // 생성 시점에는 삽입되지 않고 수정 시에만 업데이트됩니다.
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
