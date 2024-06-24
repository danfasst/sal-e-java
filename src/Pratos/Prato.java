package Pratos;

import Entidade.Entidade;

public class Prato extends Entidade{

    private String descricao;

    public Prato(int id, String nome, String descricao) {
        super(id, nome);
        this.descricao = descricao;
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