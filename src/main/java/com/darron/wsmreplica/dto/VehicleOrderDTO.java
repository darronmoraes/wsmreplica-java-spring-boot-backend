package com.darron.wsmreplica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleOrderDTO {

    private Integer id;

    private Integer vehicleId;

    private Integer orderId;

    private Double commission;

    private Byte paymentStatus;
}
