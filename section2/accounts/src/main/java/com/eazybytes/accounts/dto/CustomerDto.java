package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

// @Date - Getter, Setter 사용 가능. 엔티티 생성시 이용하지 않은 이유는 Setter 혹은 Getter만 사용하는 경우도 있기 때문.
@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be a bull or Empty")
    @Size(min = 5, max = 30, message="The length of the customer name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email can not be a bull or Empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
