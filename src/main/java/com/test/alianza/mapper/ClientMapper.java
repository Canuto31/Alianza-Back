package com.test.alianza.mapper;

import com.test.alianza.mapper.utils.BaseMapper;
import com.test.alianza.mapper.utils.MapperUtils;
import com.test.alianza.model.dto.ClientDto;
import com.test.alianza.model.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientMapper implements BaseMapper<ClientDto, Cliente> {

    @Lazy
    @Autowired
    private MapperUtils utils;

    @Override
    public ClientDto entityToDto(Cliente entity) {
        ClientDto dto = new ClientDto();

        dto.setSharedKey(entity.getSharedKey());
        dto.setBusinessId(entity.getBusinessId());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setDataAdded(entity.getDataAdded());

        return dto;
    }

    @Override
    public Cliente dtoToEntity(ClientDto dto) {
        Cliente entity = new Cliente();

        entity.setSharedKey(dto.getSharedKey());
        entity.setBusinessId(dto.getBusinessId());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setDataAdded(dto.getDataAdded());

        return entity;
    }

    @Override
    public List<ClientDto> entitiesToDtos(List<Cliente> entities) {
        return utils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Cliente> dtosToEntities(List<ClientDto> dtos) {
        return utils.dtosToEntities(dtos, this::dtoToEntity);
    }
}
