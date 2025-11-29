package com.weather.temperature.service.impl;

import com.weather.temperature.service.TemperatureService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {


    @Override
    public String getTemperature(){
        return "Hello great weather today!";
    }
}
