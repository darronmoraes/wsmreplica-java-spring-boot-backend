package com.darron.wsmreplica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {

    private Integer id;

    private String registrationNumber;

    private String name;

    private Date createdAt;

}
