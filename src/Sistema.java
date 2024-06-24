import Pedidos.GerenciadorPedidos;
import Pratos.GerenciadorPratos;
import Pratos.Prato;
import Reserva.GerenciadorReservas;

import java.io.IOException;

import Estoque.EscritaEstoque;
import Estoque.GerenciadorEstoque;
import Estoque.Ingrediente;
import Pedidos.Pedido;
import Reserva.Reserva;

public class Sistema {

    private static int lerOpcao() {
        return Console.lerInt("Escolha uma opção:");
    }

    private static void tenteNovamente() {
        System.out.println("Opção inválida. Tente novamente.");
    }

    public static void executar() {

        exibirMenuPrincipal();
        int opcao = lerOpcao();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    menuPedidos();
                    break;
                case 2:
                    mostrarPratos();
                    break;
                case 3:
                    menuEstoque();
                    break;
                case 4:
                    menuReservas();
                    break;

                default:
                    tenteNovamente();
            }
            exibirMenuPrincipal();
            opcao = lerOpcao();
        }

        System.out.println("\nPrograma finalizado!");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n--SAL & JAVA--\n");
        System.out.println("1) Pedidos");
        System.out.println("2) Pratos");
        System.out.println("3) Estoque");
        System.out.println("4) Reservas");
        System.out.println("0) Sair");
    }

    private static void menuPedidos() {
        System.out.println("\n-- Menu de Pedidos --");
        System.out.println("1) Fazer Pedido");
        System.out.println("2) Pedidos Pendentes");
        System.out.println("3) Mostrar Pedidos Concluídos");
        System.out.println("0) Voltar");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                fazerPedido();
                break;
            case 2:
                menuPedidosPendentes();
                break;
            case 3:
                mostrarPedidosConcluidos();
                break;
            case 0:
                return;
            default:
                tenteNovamente();
        }
    }

    private static void fazerPedido() {

        System.out.println("\n-- Fazer Pedido --");

        System.out.println("1) Adionar Prato");
        System.out.println("2) Concluir pedido");
        int op = lerOpcao();
        int id = 1;

        while (op == 1) {

            String nomePrato = Console.lerString("\nDigite o nome do prato para seu pedido:");
            String descricao = Console.lerString("Qual a descrição desse prato:");
            Prato prato = new Prato(id, nomePrato, descricao);

            GerenciadorPratos.adicionarPrato(prato);

            Pedido pedido = new Pedido();
            pedido.setPratos(prato);

            GerenciadorPedidos.fazerPedido(pedido);

            System.out.println("\nPrato adicionado com sucesso.");
            id++;

            System.out.println("\n1) Adionar Prato");
            System.out.println("2) Concluir pedido");
            op = lerOpcao();

        }

        System.out.println("\nPedido concluído!");
    }

    private static void menuPedidosPendentes() {

        System.out.println("\n-- Pedidos Pendentes --");
        System.out.println("1) Mostrar Pedidos Pendentes");
        System.out.println("2) Marcar Pedido como Concluído Pelo Id");
        System.out.println("0) Voltar");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                mostrarPedidosPendentes();
                break;
            case 2:
                marcarPedidoComoConcluido();
                break;
            case 0:
                return;
            default:
                tenteNovamente();
        }
    }

    private static void mostrarPedidosPendentes() {

        System.out.println("\n-- Pedidos Pendentes --");
        try {
            GerenciadorPedidos.mostrarPedidosPendentes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void marcarPedidoComoConcluido() {

        System.out.println("\n-- Marcar Pedido Pendente como Concluído --");
        int idPedido = Console.lerInt("Digite o ID do pedido a ser marcado como concluído:");
        try {
            GerenciadorPedidos.marcarPedidoComoConcluido(idPedido);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void mostrarPedidosConcluidos() {

        System.out.println("\n -- Pedidos Concluidos --");
        try {
            GerenciadorPedidos.mostrarPedidosConcluidos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarPratos() {

        System.out.println("\n-- Lista de Pratos --");

        try {
            GerenciadorPratos.mostrarPratos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean autenticarAdministrador() {
        String username = Console.lerString("Digite o nome de usuário:");
        String password = Console.lerString("Digite a senha:");
        return Autenticacao.autenticar(username, password);
    }

    private static void menuEstoque() {

        if (!autenticarAdministrador()) {
            System.out.println("\nUsuario ou senha incorreto!");
            return;
        }

        if (GerenciadorEstoque.getListaEstoque().isEmpty()) {
            Ingrediente carne = new Ingrediente(1, "Carne", 29);
            GerenciadorEstoque.adicionarIngrediente(carne);
            Ingrediente bebida = new Ingrediente(2, "Bebida", 40);
            GerenciadorEstoque.adicionarIngrediente(bebida);
            Ingrediente verdura = new Ingrediente(3, "Verdura", 10);
            GerenciadorEstoque.adicionarIngrediente(verdura);
            Ingrediente tempero = new Ingrediente(4, "Tempero", 30);
            GerenciadorEstoque.adicionarIngrediente(tempero);

            try {
                EscritaEstoque.salvarEstoque();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("\nMenu de Estoque");
        System.out.println("1) Mostrar todos ingredientes e quantidades");
        System.out.println("2) Adicionar ingredientes");
        System.out.println("0) Voltar");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                mostrarIngredientes();
                break;
            case 2:
                adicionarQuantidadeIngrediente();
                break;
            case 0:
                return;
            default:
                tenteNovamente();
        }
    }

    private static void mostrarIngredientes() {

        System.out.println("\n-- Ingredientes --\n");
        GerenciadorEstoque.mostrarDados();

    }

    private static void adicionarQuantidadeIngrediente() {
        System.out.println("\n-- Adicionar Quantidade em um Ingrediente --");
        GerenciadorEstoque.mostrarDados();
        int id = Console.lerInt("\nDigite o id do ingrediente:");
        int quantidade = Console.lerInt("Digite a quantidade a ser adicionada:");
        GerenciadorEstoque.adicionarQuantidade(id, quantidade);

        try {
            EscritaEstoque.salvarEstoque();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void menuReservas() {
        System.out.println("\nMenu de Reservas");
        System.out.println("1) Mostrar Reservas Feitas");
        System.out.println("2) Adicionar Reserva");
        System.out.println("3) Excluir Reserva");
        System.out.println("4) Editar Reserva");
        System.out.println("0) Voltar");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                mostrarReservas();
                break;
            case 2:
                adicionarReserva();
                break;
            case 3:
                excluirReserva();
                break;
            case 4:
                editarReserva();
                break;
            case 0:
                return;
            default:
                tenteNovamente();
        }
    }

    private static void mostrarReservas() {

        System.out.println("\n-- Mostrar Reservas --");

        try {
            GerenciadorReservas.mostrarReservas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void adicionarReserva() {

        System.out.println("\n-- Adicionar Reserva --");

        int id = Console.lerInt("Digite o id da reserva:");
        String nome = Console.lerString("Digite o nome do cliente:");
        int qtdPessoas = Console.lerInt("Digite a quantidade de pessoas:");
        String data = Console.lerString("Digite a data da reserva:");
        int numMesa = Console.lerInt("Digite o numero da mesa:");

        Reserva novaReserva = new Reserva(id, nome, qtdPessoas, data, numMesa);
        GerenciadorReservas.adicionarReserva(novaReserva);

    }

    private static void excluirReserva() {

        System.out.println("\n-- Excluir Reserva --");
        int idReserva = Console.lerInt("Digite o ID da reserva a ser excluída:");

        try {
            GerenciadorReservas.removerReserva(idReserva);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void editarReserva() {

        System.out.println("\n-- Editar Reserva --");
        int id = Console.lerInt("Digite o ID da reserva a ser editada:");

        try {
            GerenciadorReservas.buscarReserva(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        String nome = Console.lerString("Digite o nome do cliente:");
        int qtdPessoas = Console.lerInt("Digite a quantidade de pessoas:");
        String data = Console.lerString("Digite a data da reserva:");
        int numMesa = Console.lerInt("Digite o numero da mesa:");
        Reserva reservaEditada = new Reserva(id, nome, qtdPessoas, data, numMesa);
        try {
            GerenciadorReservas.editarReserva(id, reservaEditada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nReserva editada com sucesso.");
    }

}
