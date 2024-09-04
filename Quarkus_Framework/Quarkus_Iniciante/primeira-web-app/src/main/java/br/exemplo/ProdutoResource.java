package br.exemplo;

import jakarta.ws.rs.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("all")
@Path("/produto") // caminho da classe para acesso pelo navegador
public class ProdutoResource {

    @GET // verbo http padrão dos navegadores que é usado recuperar informações
    @Path("/nome") // caminho específico, se remover essa linha com a anotação pode acessar pela rota da classe
    public String getNomeProduto() {
        return "Laptop";
    }

    @GET
    @Path("/nome/{id}")
    public String getNomeProdutoById(@PathParam("id") Integer id) {
        if (id == 1) return "Laptop";
        return "para esse id não existe produto";
    }

    @POST
    @Path("/nome")
    public String postNomeProduto(String nomeProduto) {
        LocalDateTime dateTime = LocalDateTime.now();
        return nomeProduto + " foi processado em: " + dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH'h'mm'min'ss'seg'")); // formato incluído por conta própria, na aula usou apenas o dateTime
    }

    @PUT
    @Path("/nome")
    public String putNomeProduto(String nomeProduto) {
        LocalDateTime dateTime = LocalDateTime.now();
        return nomeProduto + " foi atualizado em: " + dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH'h'mm'min'ss'seg'"));
    }
}
