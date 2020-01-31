package com.vignesh.orderservice.controller;

import com.vignesh.orderservice.dto.Order;
import com.vignesh.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/order/{id}")
    public Order findOrderById(Integer id){
        return orderService.retrieveOrder(id);
    }
}
