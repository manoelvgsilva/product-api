package com.app.product.entity;

import java.util.Objects;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * product.
 */
@Document(collection = "products")
public class Product {
  private String id;
  private String name;
  private String description;
  private String category;
  private Double price;
  private String font;
  private Long code;
  private Double weight;

  /**
   * user.
   */
  public Product() {}

  /**
   * user.
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
  public Product(String id, String name, String description, String category,
                 Double price, String font, Long code, Double weight) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.category = category;
    this.price = price;
    this.font = font;
    this.code = code;
    this.weight = weight;
  }

  public Product(String name, String description, String category,
                 Double price, String font, Long code, Double weight) {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(id, product.id)
        && Objects.equals(name, product.name)
        && Objects.equals(description, product.description)
        && Objects.equals(category, product.category)
        && Objects.equals(price, product.price)
        && Objects.equals(font, product.font)
        && Objects.equals(code, product.code)
        && Objects.equals(weight, product.weight);
  }
}