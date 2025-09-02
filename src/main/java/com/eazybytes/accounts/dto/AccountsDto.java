package com.eazybytes.accounts.dto;

import lombok.Data;

@Data //getter, setter, toString, equals, hashCode
public class AccountsDto {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
