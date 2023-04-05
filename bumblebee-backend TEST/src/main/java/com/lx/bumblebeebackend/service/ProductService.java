package com.lx.bumblebeebackend.service;

import com.lx.bumblebeebackend.model.Product;
import com.lx.bumblebeebackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductsById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductsByName(String name) {
        return repository.findByName(name);
    }

    public Product getProductsByCategory(String category) {
        return repository.findByCategory(category);
    }

    public Product getProductsByBrand(String brand) {
        return repository.findByBrand(brand);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product Deleted!" + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setBrand(product.getBrand());
        return repository.save(existingProduct);
    }

}
