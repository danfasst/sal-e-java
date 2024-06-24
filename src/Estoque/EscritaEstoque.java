package Estoque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class EscritaEstoque {

    private static final String ARQUIVO = "estoque.txt";

    public static void salvarEstoque() throws IOException {

        ArrayList<Ingrediente> estoque = GerenciadorEstoque.getListaEstoque();

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Ingrediente ingrediente : estoque) {
                bWriter.write(ingrediente.toString() + "\n");
            }
        }
    }

    public static void lerArquivoEstoque() throws IOException {
        ArrayList<Ingrediente> estoque = GerenciadorEstoque.getListaEstoque();

        estoque.clear();
        
        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linhaIngrediente;

            while ((linhaIngrediente = bReader.readLine()) != null) {

                Ingrediente ingrediente = new Ingrediente();

                ingrediente.fromString(linhaIngrediente);

                GerenciadorEstoque.adicionarIngrediente(ingrediente);

            }
        }
    }

    public static void criarArquivoNovo() {

        try {
            File arquivo = new File(ARQUIVO);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

        } catch (IOException exception) {

            exception.printStackTrace();
        }

    }
}
