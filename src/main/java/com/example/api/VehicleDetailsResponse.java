package com.example.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VehicleDetailsResponse {

    private String owner;
    private String vehicleNumber;
    private String make;
    private String imageUrl;
    private String vehicleType;
    private String province;
    private String city;
    private String condition;
    private String fuelType;
}
