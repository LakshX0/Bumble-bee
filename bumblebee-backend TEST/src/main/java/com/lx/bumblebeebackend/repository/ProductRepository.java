package com.lx.bumblebeebackend.repository;

import com.lx.bumblebeebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);

    Product findByCategory(String category);

    Product findByBrand(String brand);
}
