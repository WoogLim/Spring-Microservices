package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

// @Date - Getter, Setter 사용 가능. 엔티티 생성시 이용하지 않은 이유는 Setter 혹은 Getter만 사용하는 경우도 있기 때문.
@Data
@Schema(
    name = "Accounts",
    description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "AccountNumber number must be 10 digits")
    @Schema(
        description = "Account Number of Eazy Bank account"
    )
    private Long accountNumber;

    @Schema(
        description = "Account Type of Eazy Bank account"
    )
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(
        description = "Account Address of Eazy Bank account"
    )
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}
