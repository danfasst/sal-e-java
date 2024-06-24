package Entidade;

public abstract class Entidade implements Dados {
    protected int id;
    protected String nome;

    public Entidade() {
    }

    public Entidade(String nome) {
        this.id = 1;
    }

    public Entidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Entidade [id=" + id + ", nome=" + nome + "]";
    }

}
