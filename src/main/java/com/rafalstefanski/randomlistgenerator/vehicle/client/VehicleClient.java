package com.rafalstefanski.randomlistgenerator.vehicle.client;

import com.rafalstefanski.randomlistgenerator.vehicle.model.Vehicle;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Stream;

@Controller
public class VehicleClient {

    // **** client for adding vehicles ****

    private RestTemplate restTemplate;

    public VehicleClient() {
        this.restTemplate = new RestTemplate();
    }

    @EventListener(ApplicationReadyEvent.class)
    private void getVehicles() {

        // creating header:
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("amount", "3");
        HttpEntity httpEntity = new HttpEntity(headers);

        // and putting into ResponseEntity
        ResponseEntity<Vehicle[]> exchange = restTemplate.exchange("http://localhost:8080/vehicles",
                HttpMethod.GET,
                httpEntity,
                Vehicle[].class);

        // printing out Vehicles to the console (for test)
//        Stream.of(exchange.getBody()).forEach(System.out::println);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void addVehicle() {

        // creating body:
        Vehicle vehicle = new Vehicle("Buick", "4x4");
        HttpEntity httpEntity = new HttpEntity(vehicle);

        // and putting into ResponseEntity
        restTemplate.exchange("http://localhost:8080/vehicles",
                HttpMethod.POST,
                httpEntity,
                Void.class);
    }
}
