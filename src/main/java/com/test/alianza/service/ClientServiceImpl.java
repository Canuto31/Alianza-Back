package com.test.alianza.service;

import com.test.alianza.model.dto.ClientDto;
import com.test.alianza.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public List<ClientDto> getAll() {
        return repository.getAllClients();
    }

    @Override
    public Optional<ClientDto> findBySharedKey(String sharedKey) {
        return repository.GetClientBySharedKey(sharedKey);
    }

    @Override
    public Optional<ClientDto> findByBusinessId(String businessId) {
        return repository.getBookByBusinessId(businessId);
    }

    @Override
    public ClientDto save(ClientDto clientDto) {
        return repository.saveClient(clientDto);
    }

    @Override
    public boolean deleteBySharedKey(String sharedKey) {
        return this.findBySharedKey(sharedKey).map(client -> {
            repository.deleteClient(sharedKey);
            return true;
        }).orElse(false);
    }
}
