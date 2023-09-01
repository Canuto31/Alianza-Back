package com.test.alianza.service;

import com.test.alianza.model.dto.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{
    @Override
    public List<ClientDto> getAll() {
        return null;
    }

    @Override
    public Optional<ClientDto> findBySharedKey(String sharedKey) {
        return Optional.empty();
    }

    @Override
    public Optional<ClientDto> findByBusinessId(String businessId) {
        return Optional.empty();
    }

    @Override
    public ClientDto save(ClientDto clientDto) {
        return null;
    }

    @Override
    public boolean deleteBySharedKey(String sharedKey) {
        return false;
    }
}
