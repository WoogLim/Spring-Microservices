package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * @param customerDto
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     */
    boolean deleteAccount(String mobileNumber);
}
