package com.weather.temperature.repository;

import com.weather.temperature.entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherEntityRepository extends JpaRepository<WeatherEntity, Long> {
}
