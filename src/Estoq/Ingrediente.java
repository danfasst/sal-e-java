import java.util.ArrayList;

public class Estoque {
    private ArrayList<Ingrediente> ingredientes;

    public Estoque() {
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void mostrarIngredientes() {
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("ID: " + ingrediente.getID() + ", Nome: " + ingrediente.getNome() + ", Quantidade: " + ingrediente.getQuantidade());
        }
    }

    public void adicionarQuantidade(int ingredienteID, int quantidade) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getID() == ingredienteID) {
                ingrediente.setQuantidade(ingrediente.getQuantidade() + quantidade);
                System.out.println("Quantidade de " + ingrediente.getNome() + " atualizada para " + ingrediente.getQuantidade());
                return;
            }
        }
        System.out.println("Ingrediente com ID " + ingredienteID + " não encontrado.");
    }
}