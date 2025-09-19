package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number is required")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "Loan Number is required")
    //@Pattern(regexp="(^$|[0-9]{15})",message = "Loan Number must be 15 digits")
    private String loanNumber;

    @NotEmpty(message = "Loan Type is required")
    private String loanType;

    @Positive(message = "Total Loan should be positive or zero")
    private int totalLoan;

    @PositiveOrZero(message = "Amount Paid should be positive or zero")
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding Amount should be positive or zero")
    private int outstandingAmount;
}
