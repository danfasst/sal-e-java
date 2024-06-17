public abstract class Entidade {
    protected int id;
    protected String nome;

    public Entidade() {
        // Construtor vazio
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

    // Método abstrato a ser implementado pelas subclasses
    public abstract String mostrarDados();
}
