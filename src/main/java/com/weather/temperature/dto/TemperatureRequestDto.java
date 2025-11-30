package com.weather.temperature.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TemperatureRequestDto {
    private Long Id;

    private Float temperature;
}
