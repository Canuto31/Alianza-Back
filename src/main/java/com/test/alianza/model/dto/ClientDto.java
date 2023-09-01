package com.test.alianza.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ClientDto {

    private String sharedKey;

    private String businessId;

    private String email;

    private String phone;

    private Date dataAdded;
}
