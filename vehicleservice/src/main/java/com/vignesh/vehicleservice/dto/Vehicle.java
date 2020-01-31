package com.vignesh.vehicleservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {

    private Integer id;
    private String name;
    private String make;
}