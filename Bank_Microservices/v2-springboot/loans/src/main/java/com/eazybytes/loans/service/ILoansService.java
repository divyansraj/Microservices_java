package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public interface ILoansService {
    void createLoans(String mobileNumber);

    LoansDto fetchLoansDetails(String mobileNumber);

    boolean updateLoansDetails(LoansDto loansDto);
    boolean deleteLoansDetails(String mobileNumber);
}
