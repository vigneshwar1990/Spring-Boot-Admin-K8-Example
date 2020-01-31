package com.vignesh.orderservice.service;

import com.vignesh.orderservice.dto.Order;
import com.vignesh.orderservice.dto.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@Service
@Slf4j
public class OrderService {

    public Order retrieveOrder(Integer id){

        callVehicleService();
        return Order.builder()
                .orderId(1001)
                .cost(2000.0)
                .quantity(1)
                .build();
    }

    private void callVehicleService() {

        WebClient vehicleClient = WebClient
                .builder()
                .baseUrl("http://localhost:8080/vehicleservice")
                .defaultCookie("cookieKey", "cookieValue")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
               // .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
                .build();

        Mono<Vehicle> vehicleMono = vehicleClient.method(HttpMethod.GET)
                .uri("/vehicle/1")
                .retrieve()
                .bodyToMono(Vehicle.class);

        vehicleMono.subscribe(t->log.info(t.getName()));


    }
}
