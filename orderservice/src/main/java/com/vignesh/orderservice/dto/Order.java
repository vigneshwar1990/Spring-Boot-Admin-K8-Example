package com.vignesh.orderservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
public class Order {

    private Integer orderId;
    private Integer quantity;
    private Double cost;
}
