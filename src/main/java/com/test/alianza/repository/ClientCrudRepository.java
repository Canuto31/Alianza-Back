package com.test.alianza.repository;

import com.test.alianza.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Cliente, String> {
}
