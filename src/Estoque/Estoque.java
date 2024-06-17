package Estoque;

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
            System.out.println("ID: " + ingrediente.id + ", Nome: " + ingrediente.nome + ", Quantidade: " + ingrediente.quantidade);
        }
    }

    public void adicionarQuantidade(int ingredienteID, int quantidade) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.id == ingredienteID) {
                ingrediente.setQuantidade(ingrediente.quantidade + quantidade);
                System.out.println("Quantidade de " + ingrediente.nome + " atualizada para " + ingrediente.quantidade);
                return;
            }
        }
        System.out.println("Ingrediente com ID " + ingredienteID + " não encontrado.");
    }
}