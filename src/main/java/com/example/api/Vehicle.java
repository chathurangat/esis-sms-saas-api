package com.example.api;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleOwner;
    private String vehicleNumber;
    private String brand;
    private String imageUrl;
    private String vehicleType;
    private String province;
    private String city;
    private String vehicleCondition;
    private String fuelType;
}
