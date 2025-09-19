package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

@Schema(
        name = "Customer", //swagger
        description = "Schema to hold customer and account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty
    @Size(min = 3, max = 50, message = "Name should be between 3 and 50 characters")
    public String name;

    @Schema(
            description = "Email of the customer", example = "john.doe@example.com"
    )
    @NotEmpty
    @Email
    public String email;

    @Schema(
            description = "Mobile Number of the customer", example = "1234567890"
    )
    @Pattern(regexp = "^$|[0-9]{10}" , message = "Mobile Number should be 10 digits")
    public String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    public AccountsDto accounts;
}
