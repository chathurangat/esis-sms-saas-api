package com.example.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class VehicleController {

    private final VehicleRepository vehicleRepository;

    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/vehicles")
    public VehicleDetailsResponse getVehicleDetails(@RequestParam("vehicle-number") String vehicleNumber) {

        Vehicle vehicle = vehicleRepository.findByVehicleNumber(vehicleNumber).orElse(null);
        if (vehicle == null) {
            return VehicleDetailsResponse.builder().build();
        }
        return VehicleDetailsResponse.builder()
                .owner(vehicle.getVehicleOwner())
                .vehicleNumber(vehicle.getVehicleNumber())
                .vehicleType(vehicle.getVehicleType())
                .imageUrl(vehicle.getImageUrl())
                .province(vehicle.getProvince())
                .city(vehicle.getCity())
                .condition(vehicle.getVehicleCondition())
                .fuelType(vehicle.getFuelType())
                .make(vehicle.getVehicleCondition())
                .build();
    }
}
