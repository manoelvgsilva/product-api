package com.app.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * productapplication.
 */
@SpringBootApplication
@EnableFeignClients
public class ProductApplication {

  /**
   * methodmain.
   *
   * @param args the args
   */
  public static void main(String[] args) {
    SpringApplication.run(ProductApplication.class, args);
  }

}
