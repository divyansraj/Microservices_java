package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Create a new account with the given customer details.
     *
     * @param customerDto
     *            Customer details
     */
    void createAccount(CustomerDto customerDto);
}
