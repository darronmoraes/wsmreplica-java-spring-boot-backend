package com.darron.wsmreplica.entity;

import com.darron.wsmreplica.entity.auditing.AuditModel;
import com.darron.wsmreplica.utils.Constants;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = Constants.TABLE_VEHICLE)
@Data
public class Vehicle extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = Constants.REGISTRATION_NO_COLUMN)
    private String registrationNumber;

    private String name;
}
