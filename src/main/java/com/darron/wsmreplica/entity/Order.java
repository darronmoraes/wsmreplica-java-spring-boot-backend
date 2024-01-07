package com.darron.wsmreplica.entity;

import com.darron.wsmreplica.entity.auditing.AuditModel;
import com.darron.wsmreplica.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = Constants.TABLE_ORDER)    // Added `orders` since order is a keyword in SQL
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "serial_no")
    private String serialNo;

    private int pax;

    private Double amount;

    @Column(name = "payment_method")
    private String paymentMethod;

}
