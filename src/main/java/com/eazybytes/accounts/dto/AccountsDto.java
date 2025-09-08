package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Name of the customer", example = "John Doe"
)
@Data //getter, setter, toString, equals, hashCode
public class AccountsDto {

    @Schema(
            description = "Account Number of the customer", example = "1234567890"
    )
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})" , message = "Account Number should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of the customer", example = "savings"
    )
    @NotEmpty(message = "Account Type should not be empty")
    private String accountType;

    @Schema(
            description = "Branch Address of the customer", example = "123 Main Street, Anytown, USA"
    )
    @NotEmpty(message = "Branch Address should not be empty")
    private String branchAddress;
}
