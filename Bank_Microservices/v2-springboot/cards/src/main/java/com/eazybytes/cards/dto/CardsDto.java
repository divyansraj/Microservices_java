package com.eazybytes.cards.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CardsDto {
    @NotEmpty(message = "Mobile Number is required")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "Card Number is required")
    private String cardNumber;

    @NotEmpty(message = "Card Type is required")
    private String cardType;

    @Positive(message = "Total Limit should be a positive number")
    private int totalLimit;

    @PositiveOrZero(message = "Amount Used should be a positive or zero number")
    private int amountUsed;

    @PositiveOrZero(message = "Available Amount should be a positive or zero number")
    private int availableAmount;
}
