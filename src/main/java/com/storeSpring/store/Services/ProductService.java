package com.storeSpring.store.Services;

import com.storeSpring.store.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<Product> getAll();
    Optional<Product> getById(Long id);
    Product save(Product product);
    Product getProductById(Long id);
    Product getOne(Long id);
}
