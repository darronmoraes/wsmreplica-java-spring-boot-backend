package com.darron.wsmreplica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Integer id;

    private String serialNo;

    private int pax;

    private Double amount;

    private String paymentMethod;

    private Date createdAt;
}
