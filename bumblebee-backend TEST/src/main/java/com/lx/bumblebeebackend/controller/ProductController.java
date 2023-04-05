package com.lx.bumblebeebackend.controller;

import com.lx.bumblebeebackend.model.Product;
import com.lx.bumblebeebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);

    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);

    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductsById(id);
    }
    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductsByName(name);
    }
    @GetMapping("/products/{brand}")
    public Product findProductByBrand(@PathVariable String brand){
        return service.getProductsByBrand(brand);
    }
    @GetMapping("/products/{category}")
    public Product findProductByCategory(@PathVariable String category){
        return service.getProductsByCategory(category);
    }

    @PutMapping("/update")
    public Product updateProducts(@RequestBody Product products) {
        return service.updateProduct(products);
    }
@DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
