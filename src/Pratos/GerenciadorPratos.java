package Pratos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPratos {
    private List<Prato> pratos;
    private int proximoId;

    public GerenciadorPratos() {
        this.pratos = new ArrayList<>();
        this.proximoId = 1;
    }

    public void adicionarPrato(String nome, String descricao) {
        Prato novoPrato = new Prato(proximoId, nome, descricao);
        pratos.add(novoPrato);
        proximoId++;
    }

    public Prato buscarPrato(int id) {
        for (Prato prato : pratos) {
            if (prato.getId() == id) {
                return prato;
            }
        }
        return null;
    }

    public void editarPrato(int id, String novoNome, String novaDescricao) {
        Prato prato = buscarPrato(id);
        if (prato != null) {
            prato.setNome(novoNome);
            prato.setDescricao(novaDescricao);
        } else {
            System.out.println("Prato não encontrado.");
        }
    }

    public void removerPrato(int id) {
        Prato prato = buscarPrato(id);
        if (prato != null) {
            pratos.remove(prato);
        } else {
            System.out.println("Prato não encontrado.");
        }
    }

    public void mostrarPratos() {
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato cadastrado.");
        } else {
            for (Prato prato : pratos) {
                System.out.println(prato);
            }
        }
    }
}