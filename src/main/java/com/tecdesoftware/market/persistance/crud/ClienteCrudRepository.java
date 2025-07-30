package com.tecdesoftware.market.persistance.crud;

import com.tecdesoftware.market.persistance.entity.Clientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteCrudRepository extends CrudRepository<Clientes, String> {

    Optional<Clientes> findByCorreoElectronico(String correoElectronico);
}
