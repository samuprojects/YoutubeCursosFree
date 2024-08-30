package br.exemplo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@SuppressWarnings("all")
@Path("/produto") // caminho da classe para acesso pelo navegador
public class ProdutoResource {

    @GET // verbo http padrão dos navegadores que é usado recuperar informações
    @Path("/nome") // caminho específico, se remover essa linha com a anotação pode acessar pela rota da classe
    public String getNomeProduto() {
        return "Laptop";
    }
}
