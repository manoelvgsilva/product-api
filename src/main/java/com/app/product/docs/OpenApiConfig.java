package com.app.product.docs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * Class to configure the OpenAPI documentation.
 */
@Configuration
public class OpenApiConfig implements OpenApiCustomizer {

  @Override
  public void customise(OpenAPI openApi) {
    Info info = new Info()
        .title("API de produtos")
        .description("Este projeto apresenta uma API RESTful que gerencia a " +
            "entrada e saida de produtos através do codigo de barras no " +
            "sistema de estoque do eccomerce "
            + " , possibilitando às pessoas usuárias criar, visualizar, atualizar e excluir"
            + " produtos, de forma intuitiva e prática. A" +
            " API " +
            "oferece" +
            " endpoints específicos para"
            + " operações CRUD (Create, Read, Update, Delete) em listas de " +
            "produtos," +
            " visando"
            + " proporcionar uma experiência consistente e confiável.")
        .version("1.0.0");

    openApi.info(info);
  }
}