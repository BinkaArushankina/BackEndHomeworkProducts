package de.ait.backendhomeworkproducts.controllers;

import de.ait.backendhomeworkproducts.models.Products;
import de.ait.backendhomeworkproducts.services.ProductsService;
import de.ait.backendhomeworkproducts.services.impl.ProductsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsServiceImpl service) {
        this.productsService = service;
    }

    @GetMapping("/products")
    @ResponseBody//woswraschaem ne naswanie view html, a body response telo otweta,  tolko dannie, on list peredeliwaet w object json, biblioteka jackson core bind
    public List<Products> getProducts(){
        return productsService.getAllProducts();
    }


}
