package com.eazybytes.accounts.dto;

import lombok.Data;

// @Date - Getter, Setter 사용 가능. 엔티티 생성시 이용하지 않은 이유는 Setter 혹은 Getter만 사용하는 경우도 있기 때문.
@Data
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
