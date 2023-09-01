package com.test.alianza.service;

import com.test.alianza.model.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<ClientDto> getAll();

    Optional<ClientDto> findBySharedKey(String sharedKey);

    Optional<ClientDto> findByBusinessId(String businessId);

    ClientDto save(ClientDto clientDto);

    boolean deleteBySharedKey(String sharedKey);
}
