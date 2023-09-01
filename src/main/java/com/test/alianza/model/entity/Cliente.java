package com.test.alianza.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @Column(name = "Shared_Key")
    private String sharedKey;

    @Column(name = "Business_Id")
    private String businessId;

    @Column(name = "E-mail")
    private String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Data Added")
    private Date dataAdded;
}
