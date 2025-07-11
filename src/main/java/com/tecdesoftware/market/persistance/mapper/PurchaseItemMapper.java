package com.tecdesoftware.market.persistance.mapper;


import com.tecdesoftware.market.domain.service.PurchaseItem;
import com.tecdesoftware.market.persistance.entity.CompraProducto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProdcuto", target = "productoId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active")

    })

    PurchaseItemMapper toPurchaseItem (CompraProducto producto);

    @InheritConfiguration
    @Mappings({
            @Mapping(target = "id.iCompra", ignore = true),
            @Mapping(target = "comrpa", ignore = true),
            @Mapping(target = "product", ignore = true)

    })
    CompraProducto toCompraProducto (PurchaseItem Item);
}
