package com.darron.wsmreplica.service;

import com.darron.wsmreplica.entity.Vehicle;
import com.darron.wsmreplica.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> fetchAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle vehicle(int id) {
        return vehicleRepository.findById(id).orElseThrow();
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public ResponseEntity<Vehicle> deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
