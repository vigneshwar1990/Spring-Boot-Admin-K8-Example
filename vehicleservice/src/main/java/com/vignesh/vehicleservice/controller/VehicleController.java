package com.vignesh.vehicleservice.controller;

import com.vignesh.vehicleservice.dto.Vehicle;
import com.vignesh.vehicleservice.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping(value = "/vehicles")
    public List<Vehicle> retrieveAllVehicles(){
       return vehicleService.retrieveVehicles();
    }

    @GetMapping(value = "/vehicle/{id}")
    public Vehicle retrieveVehicleById(Integer id){

        return vehicleService.retrieveVehicleById(id);
    }
}
