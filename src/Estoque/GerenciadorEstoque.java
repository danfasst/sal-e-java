package Estoque;

import java.util.ArrayList;

public abstract class GerenciadorEstoque {
    private static ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public static void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public static void mostrarDados() {
        
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("ID: " + ingrediente.getId() + ", Nome: " + ingrediente.getNome() + ", Quantidade: "
                    + ingrediente.quantidade);
        }
    }

    public static void adicionarQuantidade(int ingredienteID, int quantidade) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getId() == ingredienteID) {
                ingrediente.setQuantidade(ingrediente.quantidade + quantidade);
                System.out.println(
                        "\nQuantidade de " + ingrediente.getNome() + " atualizada para " + ingrediente.quantidade);
                return;
            }
        }
        System.out.println("Ingrediente com ID " + ingredienteID + " não encontrado.");
    }
}