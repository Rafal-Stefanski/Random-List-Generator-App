package com.rafalstefanski.randomlistgenerator.vehicle.api;

import com.rafalstefanski.randomlistgenerator.vehicle.model.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleApi {
    private List<Vehicle> myCarList;

    public VehicleApi() {
        this.myCarList = new ArrayList<>();
        myCarList.add(new Vehicle("BMW M3", "Coupe"));
        myCarList.add(new Vehicle("Audi A7", "Hatchback"));
        myCarList.add(new Vehicle("Buick Regal", "Wagon"));
        myCarList.add(new Vehicle("Honda Accord", "Crew Cab Pickup"));
    }

    @GetMapping
    public List<Vehicle> getVehicle(@RequestHeader int amount) {
        return myCarList.subList(0, amount);
    }

    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle) {
        myCarList.add(vehicle);
    }

}
