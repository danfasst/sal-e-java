package Pratos;

import java.util.ArrayList;

public class GerenciadorPratos {
    private static ArrayList<Prato> pratos;

    public GerenciadorPratos() {
        pratos = new ArrayList<>();
    }

    public static void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public static Prato buscarPrato(int id) throws Exception {

        for (Prato prato : pratos) {
            if (prato.getId() == id) {
                return prato;
            }
        }

        throw new Exception("\nPrato não encontrado!");
    }

    public static void editarPrato(int id, String novoNome, String novaDescricao) throws Exception {

        Prato prato = buscarPrato(id);

        if (prato != null) {
            prato.setNome(novoNome);
            prato.setDescricao(novaDescricao);
        }

        throw new Exception("\nPrato não encontrado!");
    }

    public static void removerPrato(int id) throws Exception {
        Prato prato = buscarPrato(id);
        if (prato != null) {
            pratos.remove(prato);
        }

        throw new Exception("\nPrato não encontrado!");
    }

    public static void mostrarPratos() throws Exception {
        if (pratos.isEmpty()) {
            throw new Exception("\nLista de pratos vazia!");
        }
        
        for (Prato prato : pratos) {
            System.out.println(prato);
        }
    }
}