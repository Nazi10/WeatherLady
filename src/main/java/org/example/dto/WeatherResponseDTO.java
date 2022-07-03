package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponseDTO {
    private String temperature;
    private String pressure;
    private String humidity;
    private String direction;
    private String speed;
}
