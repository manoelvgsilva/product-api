package com.app.product.service;

import com.app.product.entity.Product;
import com.app.product.repository.ProductRepository;
import com.app.product.service.exception.ProductNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * productservice.
 */
@Service
public class ProductService {
  private final ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  /**
   * getproduct.
   *
   * @param code the code
   * @return product
   */
  public Product findByCode(Long code) {
    Optional<Product> product = productRepository.findByCode(code);
    if (product.isEmpty()) {
      throw new ProductNotFoundException();
    }
    return product.get();
  }
}