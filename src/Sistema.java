import java.util.Scanner;

public class Sistema {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
                    System.out.println("Opção inválida. Tente novamente.");
            }
            exibirMenuPrincipal();
            opcao = lerOpcao();
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
        System.out.print("\nEscolha uma opção: ");
        return scanner.nextInt();
    }

    private static void menuPedidos() {
        System.out.println("\nMenu de Pedidos");
        System.out.println("1) Fazer Pedido");
        System.out.println("2) Pedidos Pendentes");
        System.out.println("3) Pedidos Concluídos para Entrega");
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void fazerPedido() {
        // Implementar lógica para fazer um novo pedido
        System.out.println("Implementar fazerPedido()");
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

    private static void mostrarPedidosEmAberto() {
        // Implementar lógica para mostrar os pedidos em aberto
        System.out.println("Implementar mostrarPedidosEmAberto()");
    }

    private static void editarPedido() {
        // Implementar lógica para editar um pedido pelo ID
        System.out.println("Implementar editarPedido()");
    }

    private static void marcarPedidoConcluido() {
        // Implementar lógica para marcar um pedido como concluído pelo ID
        System.out.println("Implementar marcarPedidoConcluido()");
    }

    private static void mostrarPedidosConcluidos() {
        // Implementar lógica para mostrar os pedidos concluídos
        System.out.println("Implementar mostrarPedidosConcluidos()");
    }

    private static void mostrarPratos() {
        // Implementar lógica para mostrar os pratos cadastrados
        System.out.println("Implementar mostrarPratos()");
    }

    private static void menuEstoque() {
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void mostrarIngredientes() {
        // Implementar lógica para mostrar todos os ingredientes e suas quantidades
        System.out.println("Implementar mostrarIngredientes()");
    }

    private static void adicionarQuantidadeIngrediente() {
        // Implementar lógica para adicionar mais quantidade a um ingrediente
        System.out.println("Implementar adicionarQuantidadeIngrediente()");
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
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void mostrarReservas() {
        // Implementar lógica para mostrar as reservas feitas
        System.out.println("Implementar mostrarReservas()");
    }

    private static void adicionarReserva() {
        // Implementar lógica para adicionar uma reserva
        System.out.println("Implementar adicionarReserva()");
    }

    private static void excluirReserva() {
        // Implementar lógica para excluir uma reserva
        System.out.println("Implementar excluirReserva()");
    }

    private static void editarReserva() {
        // Implementar lógica para editar uma reserva
        System.out.println("Implementar editarReserva()");
    }
}
