package com.test.alianza.repository;

import com.test.alianza.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientCrudRepository extends CrudRepository<Cliente, String> {

    Optional<Cliente> findClientByBusinessId(String businessId);
}
