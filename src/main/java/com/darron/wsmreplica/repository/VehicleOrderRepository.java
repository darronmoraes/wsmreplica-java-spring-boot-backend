package com.darron.wsmreplica.repository;

import com.darron.wsmreplica.entity.VehicleOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOrderRepository extends JpaRepository<VehicleOrder, Integer> {
}
