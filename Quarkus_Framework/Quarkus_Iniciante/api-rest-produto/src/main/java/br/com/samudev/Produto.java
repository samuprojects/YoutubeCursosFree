package br.com.samudev;

import jakarta.enterprise.context.ApplicationScoped;

@SuppressWarnings("all")
@ApplicationScoped
public class Produto {

    private long id;
    private String nome;
    private double preco;

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
