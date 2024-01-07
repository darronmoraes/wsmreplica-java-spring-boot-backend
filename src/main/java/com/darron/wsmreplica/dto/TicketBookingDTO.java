package com.darron.wsmreplica.dto;

import com.darron.wsmreplica.entity.Order;
import com.darron.wsmreplica.entity.Vehicle;
import com.darron.wsmreplica.entity.VehicleOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketBookingDTO {

    private Order order;
    private Vehicle vehicle;
    private VehicleOrder vehicleOrder;

}
