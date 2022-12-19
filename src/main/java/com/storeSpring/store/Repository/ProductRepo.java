package com.storeSpring.store.Repository;

import com.storeSpring.store.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    @Query("select client from Client client where client.id= :id ")
    public Product getProductById(@Param("id") Long id);
}
