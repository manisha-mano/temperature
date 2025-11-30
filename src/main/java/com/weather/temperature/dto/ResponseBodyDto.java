package com.weather.temperature.dto;

import lombok.Data;

@Data
public class ResponseBodyDto {
    private int statusCode;

    private String message;

    private Boolean isErr;
}
