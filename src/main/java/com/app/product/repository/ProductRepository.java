package com.app.product.repository;

import com.app.product.entity.Product;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * productrepository.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
  Optional<Product> findByCode(Long code);
}