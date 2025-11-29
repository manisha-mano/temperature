package com.weather.temperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(value="com.weather.temperature.*")
public class TemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureApplication.class, args);
	}

}
