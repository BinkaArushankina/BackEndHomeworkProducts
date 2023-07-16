package de.ait.backendhomeworkproducts.services.impl;

import de.ait.backendhomeworkproducts.models.Products;
import de.ait.backendhomeworkproducts.repositories.ProductsRepository;
import de.ait.backendhomeworkproducts.services.ProductsService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;


    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
    @Override
    public List<Products> getAllProducts(){
       return productsRepository.findAll();
    }



}
