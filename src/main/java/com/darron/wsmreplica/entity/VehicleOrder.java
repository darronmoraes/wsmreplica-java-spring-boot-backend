package com.darron.wsmreplica.entity;

import com.darron.wsmreplica.utils.Constants;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = Constants.TABLE_VEHICLE_ORDER)
@Data
public class VehicleOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column(name = Constants.VEHICLE_ID_COLUMN)
    @ManyToOne
    @JoinColumn(name = Constants.VEHICLE_ID_COLUMN)
    private Vehicle vehicle;

    //@Column(name = Constants.ORDER_ID_COLUMN)
    @ManyToOne
    @JoinColumn(name = Constants.ORDER_ID_COLUMN)
    private Order order;

    @Column(name = Constants.COMMISSION_AMOUNT_COLUMN)
    private Double commission;

    @Column(name = Constants.PAYMENT_STATUS_COLUMN)
    private Byte paymentStatus;
}
