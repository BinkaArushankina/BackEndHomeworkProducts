package de.ait.backendhomeworkproducts.repositories;

import de.ait.backendhomeworkproducts.models.Products;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository {
    List<Products> findAll();
}
