
---

# Projeto Quarkus: API de Produtos

Este projeto Quarkus é um exercício prático para consolidar os conceitos aprendidos nas seis aulas anteriores do canal de [Marcio Silva](https://www.youtube.com/playlist?list=PL9K59CMzoAG-IWvaSXnv6HbkFDX_L0HM7). O objetivo é demonstrar a implementação de uma API REST utilizando os verbos HTTP básicos: GET, POST, PUT e DELETE.

## Estrutura do Projeto

O projeto consiste em uma API para gerenciar produtos, incluindo operações básicas de CRUD. A seguir, está uma breve descrição do código e das funcionalidades implementadas.

### Entidades e Recursos

#### Classe `Produto`

A classe `Produto` representa a entidade do produto com os seguintes atributos:

- `id` (long): Identificador único do produto.
- `nome` (String): Nome do produto.
- `preco` (double): Preço do produto.

```java
package br.com.samudev;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Produto {

    private long id;
    private String nome;
    private double preco;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
```

#### Classe `ProdutoResource`

A classe `ProdutoResource` define os endpoints da API para operações CRUD sobre a entidade `Produto`.

- **GET `/produto`**: Recupera todos os produtos cadastrados.

  ```java
  @GET
  public List<Produto> getTodosProdutos() {
      return itens;
  }
  ```

- **POST `/produto`**: Adiciona um novo produto à lista.

  ```java
  @POST
  public String postNovoProduto(Produto produto) {
      itens.add(produto);
      return "Produto cadastrado com sucesso!";
  }
  ```

- **PUT `/produto/{id}`**: Atualiza um produto existente identificado pelo `id`.

  ```java
  @PUT
  @Path("/{id}")
  public String putProduto(@PathParam("id") long id, Produto produtoAtualizado) {
      itens.stream()
          .filter(produto -> produto.getId() == id )
          .findFirst()
          .ifPresent(produto -> {
              produto.setNome(produtoAtualizado.getNome());
              produto.setPreco(produtoAtualizado.getPreco());
          });
      return "Atualização feita com sucesso!";
  }
  ```

- **DELETE `/produto/{id}`**: Remove um produto da lista pelo `id`.

  ```java
  @DELETE
  @Path("/{id}")
  public String deleteProduto(@PathParam("id") long id){
      itens = itens.stream()
          .filter(produto -> produto.getId() != id)
          .collect(Collectors.toList());
      return "Exclusão feita com sucesso!";
  }
  ```

## Como Executar

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Compile e Execute o Projeto**

   Utilize o comando Maven para compilar e executar o projeto:

   ```bash
   ./mvnw compile quarkus:dev
   ```

3. **Testar a API**

   A API estará disponível em `http://localhost:8080/produto`. Você pode usar ferramentas como Postman ou cURL para testar os endpoints.

## Contribuições

Se você quiser contribuir para este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request. Toda contribuição é bem-vinda!

---
