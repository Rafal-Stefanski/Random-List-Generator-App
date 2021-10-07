package com.rafalstefanski.randomlistgenerator.vehicle.controller;

import com.rafalstefanski.randomlistgenerator.vehicle.model.VehicleRandom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/vehicles-gui/")
public class VehicleController {


    private VehicleRandom[] getVehicles() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate
                .getForObject("https://random-data-api.com/api/vehicle/random_vehicle?size=10",
                        VehicleRandom[].class);
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("vehicles", getVehicles());
        return "vehicles-gui/vehicle_view";
    }
}
