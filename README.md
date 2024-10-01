# product-api

api para registrar um produto em um sistema ecommerce contendo as
seguintes rotas GET e POST

# Pré requisitos

Java 17
Maven 3.6
Docker
Mongo 6
Kafka

# Instalação

1. Clone o repositório:
   ```zsh
   git clone https://github.com/manoelvgsilva/product-api.git
   ```

2. Navegue até o diretório do projeto:
   ```zsh
   cd product-api
   ```

3. Instale as dependências:
   ```zsh
   mvn install
   ```

4. Para rodar em Docker:
   ```zsh
   docker-compose up -d
   ```

5. Inicie a aplicação:
   ```zsh
   mvn spring-boot:run
   ```

### Endpoints principais:

- `POST /products`: Cria um novo produto.
- `GET /products/{code}`: Retorna um produto especifico atraves do codigo de 
  barra

#### Exemplo de requisição para criar um produto:
```zsh
curl -X POST http://localhost:8080/products
-H "Content-Type: application/json" \
-d '{
    "name": "cafe",
    "description": "bebida preta quente",
    "category": "bebida energetica",
    "price": "15.3",
    "font": "cafuso",
    "code": "012948073657486349",
    "weight": "1kg"
}'