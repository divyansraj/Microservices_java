package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@Schema(
        name = "Error Response", //swagger
        description = "Schema to hold error response message"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {
    @Schema(
            description = "API Path where error occurred"
    )
    private String apiPath;

    @Schema(
            description = "HTTP Status Code when exception occurred"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error Message received when exception occurred"
    )
    private String errorMessage;
    @Schema(
            description = "Error Time when exception occurred"
    )
    private LocalDateTime errorTime;
}
