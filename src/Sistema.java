import Pedidos.GerenciadorPedidos;
import Pedidos.ListaPendentes;
import Pedidos.Pedido;
import Reserva.Reserva;

public class Sistema {

    public static void main(String[] args) {
        exibirMenuPrincipal();
        int opcao = Console.lerInt("Escolha uma opção:");

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
                    System.out.println("Opção inválida. Tente novamente.");
            }
            exibirMenuPrincipal();
            opcao = Console.lerInt("Escolha uma opção:");
        }

        System.out.println("Saindo do sistema. Até logo!");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\nSal & Java\n");
        System.out.println("1) Pedidos");
        System.out.println("2) Pratos");
        System.out.println("3) Estoque");
        System.out.println("4) Reservas");
        System.out.println("0) Sair");
    }

    private static int lerOpcao() {
        return Console.lerInt("Escolha uma opção:");
    }
    

    private static void menuPedidos() {
        System.out.println("\nMenu de Pedidos");
        System.out.println("1) Fazer Pedido");
        System.out.println("2) Pedidos Pendentes");
        System.out.println("3) Pedidos Concluídos para Entrega");
        System.out.println("0) Voltar");
    
        int opcao = Console.lerInt("Escolha uma opção:");
    
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void fazerPedido() {
        System.out.println("\n-- Fazer Pedido --");
        System.out.print("Digite o nome do cliente: ");
        String cliente = Console.lerString(null);
        System.out.print("Digite a descrição do pedido: ");
        String descricao = scanner.nextLine();

        Pedido novoPedido = new Pedido(cliente, descricao);
        GerenciadorPedidos.adicionarPedido(novoPedido);
        System.out.println("Pedido adicionado com sucesso.");
    }

    private static void menuPedidosPendentes() {
        System.out.println("\nPedidos Pendentes");
        System.out.println("1) Mostrar Pedidos Em Aberto");
        System.out.println("2) Editar Pedido Pelo Id");
        System.out.println("3) Marcar Pedido como Concluído Pelo Id");
        System.out.println("0) Voltar");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                mostrarPedidosEmAberto();
                break;
            case 2:
                editarPedido();
                break;
            case 3:
                marcarPedidoConcluido();
                break;
            case 0:
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void fazerPedido() throws Exception {
        System.out.println("\n-- Fazer Pedido --");
        Prato prato = Console.lerString("Digite o nome do prato:");
        Pedido novoPedido = new Pedido();
        novoPedido.adicionarPrato(prato);


        try {
            ListaPendentes.adicionarPedido(novoPedido);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Pedido adicionado com sucesso.");
    }
    
    private static void editarPedido() {
        System.out.println("\n-- Editar Pedido Pelo Id --");
        int idPedido = Console.lerInt("Digite o ID do pedido a ser editado:");
        Pedido pedido = GerenciadorPedidos.buscarPedido(idPedido);
        if (pedido != null) {
            String descricao = Console.lerString("Digite a nova descrição do pedido:");
            pedido.setDescricao(descricao);
            GerenciadorPedidos.editarPedido(idPedido, pedido);
            System.out.println("Pedido editado com sucesso.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
    
    private static void marcarPedidoConcluido() {
        System.out.println("\n-- Marcar Pedido como Concluído pelo Id --");
        int idPedido = Console.lerInt("Digite o ID do pedido a ser marcado como concluído:");
        Pedido pedido = GerenciadorPedidos.buscarPedido(idPedido);
        if (pedido != null) {
            GerenciadorPedidos.marcarPedidoConcluido(idPedido);
            System.out.println("Pedido marcado como concluído com sucesso.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
    

    private static void menuEstoque() {
        System.out.println("\nMenu de Estoque");
        System.out.println("1) Mostrar todos ingredientes e quantidades");
        System.out.println("2) Adicionar ingredientes");
        System.out.println("0) Voltar");
    
        int opcao = Console.lerInt("Escolha uma opção:");
    
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private static void mostrarIngredientes() {
        System.out.println("\n-- Mostrar Ingredientes e Quantidades --");
        gerenciadorEstoque.mostrarIngredientes();
    }
    
    private static void adicionarQuantidadeIngrediente() {
        System.out.println("\n-- Adicionar Quantidade em um Ingrediente --");
        String nome = Console.lerString("Digite o nome do ingrediente:");
        int quantidade = Console.lerInt("Digite a quantidade a ser adicionada:");
        gerenciadorEstoque.adicionarQuantidade(nome, quantidade);
        System.out.println("Quantidade adicionada com sucesso.");
    }
    

    private static void menuReservas() {
        System.out.println("\nMenu de Reservas");
        System.out.println("1) Mostrar Reservas Feitas");
        System.out.println("2) Adicionar Reserva");
        System.out.println("3) Excluir Reserva");
        System.out.println("4) Editar Reserva");
        System.out.println("0) Voltar");
    
        int opcao = Console.lerInt("Escolha uma opção:");
    
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private static void mostrarReservas() {
        System.out.println("\n-- Mostrar Reservas --");
        gerenciadorReservas.mostrarReservas();
    }
    
    private static void adicionarReserva() {
        System.out.println("\n-- Adicionar Reserva --");
        String cliente = Console.lerString("Digite o nome do cliente:");
        String data = Console.lerString("Digite a data da reserva:");
    
        Reserva novaReserva = new Reserva(cliente, data);
        gerenciadorReservas.adicionarReserva(novaReserva);
        System.out.println("Reserva adicionada com sucesso.");
    }
    
    private static void excluirReserva() {
        System.out.println("\n-- Excluir Reserva --");
        int idReserva = Console.lerInt("Digite o ID da reserva a ser excluída:");
        Reserva reserva = gerenciadorReservas.buscarReserva(idReserva);
        if (reserva != null) {
            gerenciadorReservas.removerReserva(idReserva);
            System.out.println("Reserva excluída com sucesso.");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }
    
    private static void editarReserva() {
        System.out.println("\n-- Editar Reserva --");
        int idReserva = Console.lerInt("Digite o ID da reserva a ser editada:");
        Reserva reserva = gerenciadorReservas.buscarReserva(idReserva);
        if (reserva != null) {
            String cliente = Console.lerString("Digite o novo nome do cliente:");
            String data = Console.lerString("Digite a nova data da reserva:");
            Reserva reservaEditada = new Reserva(cliente, data);
            gerenciadorReservas.editarReserva(idReserva, reservaEditada);
            System.out.println("Reserva editada com sucesso.");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }
    
}
