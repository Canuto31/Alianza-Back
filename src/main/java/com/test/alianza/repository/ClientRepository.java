package com.test.alianza.repository;

import com.test.alianza.model.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    List<ClientDto> getAllClients();

    Optional<ClientDto> GetClientBySharedKey(String sharedKey);

    Optional<ClientDto> getBookByBusinessId(String businessId);

    ClientDto saveClient(ClientDto clientDto);

    void deleteClient(String sharedKey);
}
