package br.exemplo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

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
}
