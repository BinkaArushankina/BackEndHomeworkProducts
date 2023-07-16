package de.ait.backendhomeworkproducts.services;

import de.ait.backendhomeworkproducts.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {
    List<Products> getAllProducts();
}
