package com.app.product.service.exception;

/**
 * stocknotfoundexception.
 */
public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException() {
    super("Produto não encontrado!");
  }
}