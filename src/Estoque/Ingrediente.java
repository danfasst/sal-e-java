package Estoque;
import Entidade.Entidade;

public class Ingrediente extends Entidade {
    protected int quantidade;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDados'");
    }
}