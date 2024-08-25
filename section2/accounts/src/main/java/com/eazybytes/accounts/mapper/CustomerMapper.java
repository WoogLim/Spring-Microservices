package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    /**
     * @desc 클라이언트에게 응답시 이용
     */
    public static CustomerDto mapToCustomerDTO(Customer customer, CustomerDto customerDTO){
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setMobileNumber(customer.getMobileNumber());
        return customerDTO;
    }

    /**
     * @desc 클라이언트로부터 요청 데이터 반영시 이용
     */
    public static Customer mapToCustomer(CustomerDto customerDTO, Customer customer){
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        return customer;
    }
}
