package com.app.product.controller;

import com.app.product.controller.dto.ProductCreationDto;
import com.app.product.controller.dto.ProductDto;
import com.app.product.entity.Product;
import com.app.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * productcontroller.
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {
  private final ProductService productService;

  /**
   * productcontroller.
   *
   * @param productService the productservice
   */
  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  /**
   * createproduct.
   *
   * @param productCreationDto the productcreationdto
   * @return stock
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ProductDto createProduct(
      @RequestBody ProductCreationDto productCreationDto
  ) {
    return ProductDto.fromEntity(
        productService.createProduct(productCreationDto.toEntity())
    );
  }

  /**
   * getProduct.
   *
   * @param code the code
   * @return product
   */
  @GetMapping("/{code}")
  public ProductDto getProduct(@PathVariable Long code) {
    Product getProduct = productService.findByCode(code);
    return ProductDto.fromEntity(getProduct);
  }
}