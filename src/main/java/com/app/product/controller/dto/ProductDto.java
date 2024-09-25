package com.app.product.controller.dto;

import com.app.product.entity.Product;

/**
 * productdto.
 *
 * @param id the id
 * @param name the name
 * @param description the description
 * @param category the category
 * @param price the price
 * @param font the font
 * @param code the code
 * @param weight the weight
 */
public record ProductDto(
    String id,
    String name,
    String description,
    String category,
    Double price,
    String font,
    Long code,
    Double weight
) {

  /**
   * productdto.
   *
   * @param product the product
   * @return product
   */
  public static ProductDto fromEntity(Product product) {
    return new ProductDto(
        product.getId(),
        product.getName(),
        product.getDescription(),
        product.getCategory(),
        product.getPrice(),
        product.getFont(),
        product.getCode(),
        product.getWeight()
    );
  }
}
