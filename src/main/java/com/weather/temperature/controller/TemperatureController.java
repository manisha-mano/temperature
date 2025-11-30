package com.weather.temperature.controller;

import com.weather.temperature.dto.ResponseBodyDto;
import com.weather.temperature.dto.TemperatureRequestDto;
import com.weather.temperature.service.TemperatureService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@AllArgsConstructor
public class TemperatureController {

    TemperatureService temperatureService;
    //TemperatureController(TemperatureService temperatureService) {
//        this.temperatureService = temperatureService;
//    }


    @GetMapping("/v1/weather/getTemperature")
    public String getTemperature(){
        return temperatureService.getTemperature();
    }

    @PostMapping("v1/weather/addTemperature")
    public ResponseBodyDto addTemperature(@RequestBody(required=false) TemperatureRequestDto temperatureRequestDto ){
        return temperatureService.addTemperature(temperatureRequestDto);
    }
}
