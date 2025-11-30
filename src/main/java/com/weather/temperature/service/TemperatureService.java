package com.weather.temperature.service;

import com.weather.temperature.dto.ResponseBodyDto;
import com.weather.temperature.dto.TemperatureRequestDto;

public interface TemperatureService {

    public String getTemperature();

    public ResponseBodyDto addTemperature(TemperatureRequestDto temperatureRequestDto);

}
