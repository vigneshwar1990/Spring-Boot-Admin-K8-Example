package com.vignesh.vehicleservice.service;

import com.vignesh.vehicleservice.dto.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class VehicleService {

    public List<Vehicle> retrieveVehicles(){
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle vehicle1 = Vehicle.builder()
                .id(1)
                .make("Toyota")
                .name("Camry")
                .build();

        Vehicle vehicle2 = Vehicle.builder()
                .id(2)
                .make("Honda")
                .name("Civic")
                .build();

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        return vehicleList;
    }

    public Vehicle retrieveVehicleById(Integer id) {
      return Vehicle.builder()
                .id(1)
                .make("Toyota")
                .name("Camry")
                .build();

    }
}
