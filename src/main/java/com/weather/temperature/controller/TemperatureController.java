package com.weather.temperature.controller;

import com.weather.temperature.service.TemperatureService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@AllArgsConstructor
public class TemperatureController {

    TemperatureService temperatureService;
    //TemperatureController(TemperatureService temperatureService) {
//        this.temperatureService = temperatureService;
//    }




    @GetMapping("/v1/weather/getTemperature")
    @ResponseBody
    public String getTemperature(){
        return temperatureService.getTemperature();
    }
}
