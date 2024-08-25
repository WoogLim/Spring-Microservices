package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {

    // 엔티티와 개체를 매퍼 하는 용도로 이용
    // 관련 라이브러리도 존재. modelmapper, map struct 다만 spring.io에서 권장하지 않음.

    // 클라이언트에게 응답시 이용
    // 첫 번째 인자로 엔티티, 두번째 인자는 DTO 개체 Accounts의 모든 데이터를 AccountsDto 개체로 모두 매핑
    /**
     * @desc 클라이언트에게 응답시 이용
     */
    public static AccountsDto mapToAccountsDTO(Accounts accounts, AccountsDto accountsDTO){
        accountsDTO.setAccountNumber(accounts.getAccountNumber());
        accountsDTO.setAccountType(accounts.getAccountType());
        accountsDTO.setBranchAddress(accounts.getBranchAddress());
        return accountsDTO;
    }

    // 클라이언트로부터 요청시 이용
    // 첫 번째 인자로 엔티티, 두번째 인자는 DTO 개체 AccountsDto 모든 데이터를 Accounts 개체로 모두 매핑
    /**
     * @desc 클라이언트로부터 요청 데이터 반영시 이용
     */
    public static Accounts mapToAccounts(AccountsDto accountsDTO, Accounts accounts){
        accounts.setAccountNumber(accountsDTO.getAccountNumber());
        accounts.setAccountType(accountsDTO.getAccountType());
        accounts.setBranchAddress(accountsDTO.getBranchAddress());
        return accounts;
    }
}
