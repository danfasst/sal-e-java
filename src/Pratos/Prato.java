package Pratos;

import Entidade.Entidade;

public class Prato extends Entidade{

    private String descricao;

    public Prato(String nome, String descricao) {
        super(id, nome);
        id = 1;
        this.descricao = descricao;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nID" + id + "\nNome: " + nome + "\nDescricao: " + descricao);
    }

}