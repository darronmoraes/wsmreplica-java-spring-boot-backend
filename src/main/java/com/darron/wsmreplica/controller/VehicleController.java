package com.darron.wsmreplica.controller;

import com.darron.wsmreplica.entity.Vehicle;
import com.darron.wsmreplica.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<Vehicle> vehicles() {
        return vehicleService.fetchAllVehicles();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle vehicle(@PathVariable int id) {
        return vehicleService.vehicle(id);
    }

    @PostMapping("/vehicles")
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @DeleteMapping("/vehicles/{id}")
    public String deleteVehicle(@PathVariable int id) {
        return String.valueOf(vehicleService.deleteVehicle(id));
    }
}
