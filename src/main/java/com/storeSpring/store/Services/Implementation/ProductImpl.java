package com.storeSpring.store.Services.Implementation;

import com.storeSpring.store.Entity.Product;
import com.storeSpring.store.Repository.ProductRepo;
import com.storeSpring.store.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ProductImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public Product save(Product product ) {
        productRepo.save(product);
        return product;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.getProductById(id);
    }

    @Override
    public Product getOne(Long id) {
        return productRepo.getOne(id);
    }
}
