package com.darron.wsmreplica.repository;

import com.darron.wsmreplica.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
