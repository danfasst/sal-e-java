package Pratos;

import java.util.ArrayList;

public abstract class GerenciadorPratos {
    
    private static ArrayList<Prato> pratos = new ArrayList<>();

    public static void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public static void mostrarPratos() throws Exception {
        if (pratos.isEmpty()) {
            throw new Exception("\nLista de pratos vazia!");
        }
        
        for (Prato prato : pratos) {
            prato.mostrarDados();
        }
    }
}