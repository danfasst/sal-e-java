package Estoque;
import Entidade.Entidade;

public class Ingrediente extends Entidade {

    protected int quantidade;

    public Ingrediente() {
    }

    public Ingrediente(int id, String nome, int quantidade) {
        super(id, nome);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nID " + id + "\nNome: " + nome + "\nQuantidade: " + quantidade);
    }

    @Override
    public String toString() {
        return "Ingrediente id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + "";
    }

    public void fromString(String linhaIngrediente) {

        String[] partes = linhaIngrediente.split(", ");

        id = Integer.parseInt(partes[0].split("=")[1]);
        nome = partes[1].split("=")[1];
        quantidade = Integer.parseInt(partes[2].split("=")[1]);

    }
    
}