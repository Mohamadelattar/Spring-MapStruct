package com.example.demo.product;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Mapping(source = "productName", target = "name")
    ProductDTO productToProductDTO(Product product);
    @Mapping(source = "priceEuro", target = "price")
    Product productDTOToProduct(ProductDTO productDTO);

    List<ProductDTO> productsToProductDTOs(List<Product> products);
}
