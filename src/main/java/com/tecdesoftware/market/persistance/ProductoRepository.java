package com.tecdesoftware.market.persistance;

import com.tecdesoftware.market.persistance.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistance.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Le dice a Spring que este repositorio se conecta con la BD
@Repository

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //Me va a dar todos los productos de mi BD
    public List<Producto> getAll(){
        //Convirtiendo un iterable <T> a una lista de prodcutos List<Producto>
        return (List<Producto>) productoCrudRepository.findAll();
    }
    //Obtiene los productos por categoria ordenados de maner Ascendente
    public List<Producto> getByIdCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    //Obtener productos que se vayan a agotar
    public Optional<List<Producto>> getEscasos (int Cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(Cantidad, true);
    }

    //Obtener un producto dado el id

    public Optional<Producto> getProductoById(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    //guardar un producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //borrar un producto
    public void delete(Producto producto){
        productoCrudRepository.delete(producto);
    }
}
