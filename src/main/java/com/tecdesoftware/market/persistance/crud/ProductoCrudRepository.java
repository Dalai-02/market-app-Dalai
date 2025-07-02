package com.tecdesoftware.market.persistance.crud;

import com.tecdesoftware.market.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Query Methods
    //SQL: Select *
    //FROM Categoria
    //WHERE Id_Categoria = ?
    //ORDER BY Nombre ASC
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
