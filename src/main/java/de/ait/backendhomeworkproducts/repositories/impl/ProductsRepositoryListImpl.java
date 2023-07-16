package de.ait.backendhomeworkproducts.repositories.impl;

import de.ait.backendhomeworkproducts.models.Products;
import de.ait.backendhomeworkproducts.repositories.ProductsRepository;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;
@Repository
public class ProductsRepositoryListImpl implements ProductsRepository {

    private List<Products> products;

    public ProductsRepositoryListImpl(){
        Products bread = new Products(1L, "Bread",5,true);
        Products milk = new Products(2L, "Milk",20,false);
        Products salt = new Products(3L, "Salt",11,true);
        Products sugar = new Products(4L, "Sugar",6,false);

        this.products = Arrays.asList(bread,milk,salt,sugar);
    }
    @Override
    public List<Products> findAll() {
        return products;
    }

}
