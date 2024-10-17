package com.example.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/vehicles")
    public VehicleDetailsResponse getVehicleDetails(@RequestParam("vehicle-number") String vehicleNumber) {

        return VehicleDetailsResponse.builder()
                .owner("Shanaka")
                .vehicleNumber("DA-1234")
                .vehicleType("Car")
                .imageUrl("https://eu2.contabostorage.com/014d85f72af04deab35beb05d491b530:asda/img2.png")
                .province("Western")
                .city("Colombo")
                .condition("NEW")
                .fuelType("Electric")
                .make("Toyota")
                .build();
    }
}
