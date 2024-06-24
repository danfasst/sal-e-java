package Pratos;

public class Prato {
    private int id = 1;
    private String nome;
    private String descricao;

    public Prato(String nome, String descricao) {
        this.nome = nome;
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
    public String toString() {
        return "Prato{" +
                "  id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}