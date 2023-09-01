package com.test.alianza.repository;

import com.test.alianza.mapper.ClientMapper;
import com.test.alianza.model.dto.ClientDto;
import com.test.alianza.model.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepositoryImpl implements ClientRepository{

    @Autowired
    private ClientCrudRepository repository;
    @Autowired
    private ClientMapper mapper;

    @Override
    public List<ClientDto> getAllClients() {
        List<Cliente> clients = (List<Cliente>) repository.findAll();
        return mapper.entitiesToDtos(clients);
    }

    @Override
    public Optional<ClientDto> GetClientBySharedKey(String sharedKey) {
        return repository.findById(sharedKey).map(client -> mapper.entityToDto(client));
    }

    @Override
    public Optional<ClientDto> getBookByBusinessId(String businessId) {
        return repository.findClientByBusinessId(businessId).map(client -> mapper.entityToDto(client));
    }

    @Override
    public ClientDto saveClient(ClientDto clientDto) {
        Cliente client = mapper.dtoToEntity(clientDto);
        return mapper.entityToDto(repository.save(client));
    }

    @Override
    public void deleteClient(String sharedKey) {
        repository.deleteById(sharedKey);
    }
}
