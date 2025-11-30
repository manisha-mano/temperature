package com.weather.temperature.service.impl;

import com.weather.temperature.dto.ResponseBodyDto;
import com.weather.temperature.dto.TemperatureRequestDto;
import com.weather.temperature.entity.WeatherEntity;
import com.weather.temperature.repository.WeatherEntityRepository;
import com.weather.temperature.service.TemperatureService;
import org.springframework.stereotype.Service;

@Service

public class TemperatureServiceImpl implements TemperatureService {


    WeatherEntityRepository weatherEntityRepository;

    TemperatureServiceImpl(WeatherEntityRepository weatherEntityRepository){
        this.weatherEntityRepository = weatherEntityRepository;
    }

    @Override
    public String getTemperature(){
        return "Hello great weather today!";
    }

    @Override
    public ResponseBodyDto addTemperature(TemperatureRequestDto temperatureRequestDto){
        WeatherEntity weatherEntity = new WeatherEntity();
//        weatherEntity.setId(temperatureRequestDto.getId());
        weatherEntity.setTemperature(temperatureRequestDto.getTemperature());
        weatherEntityRepository.save(weatherEntity);
        ResponseBodyDto responseBodyDto = new ResponseBodyDto();
        responseBodyDto.setIsErr(false);
        responseBodyDto.setStatusCode(201);
        responseBodyDto.setMessage("Data saved successfully");
        return responseBodyDto;
    }

}
