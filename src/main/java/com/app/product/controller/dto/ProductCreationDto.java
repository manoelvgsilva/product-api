package com.app.product.controller.dto;

import com.app.product.entity.Product;

/**
 * productcreation.
 *
 * @param name the name
 * @param description the description
 * @param category the category
 * @param price the price
 * @param font the font
 * @param code the font
 * @param weight the weight
 */
public record ProductCreationDto(
    String name,
    String description,
    String category,
    Double price,
    String font,
    Long code,
    Double weight
) {

  /**
   * toentity.
   *
   * @return product
   */
  public Product toEntity() {
    return new Product(name, description, category, price, font, code, weight);
  }
}
