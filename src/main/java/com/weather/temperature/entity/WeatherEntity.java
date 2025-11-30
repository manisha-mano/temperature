package com.weather.temperature.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float temperature;

    public long getId(){return this.id;}

    public void setId(long currid){
        this.id = currid;
    }

    public float getTemperature(){
        return this.temperature;
    }

    public void setTemperature(float value){
        this.temperature=value;
    }


}
