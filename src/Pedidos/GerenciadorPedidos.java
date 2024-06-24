package Pedidos;
import java.util.ArrayList;

public abstract class GerenciadorPedidos {

    private static ArrayList<Pedido> pedidosPendentes = new ArrayList<>();
    private static ArrayList<Pedido> pedidosConcluidos = new ArrayList<>();
    private static ArrayList<Pedido> allPedidos = new ArrayList<>();

    public static String StringException() {
        return "\nPedido não encontrado!";
    }

    public static ArrayList<Pedido> allPedidos() throws Exception{
        for (Pedido pedido : pedidosPendentes) {
            allPedidos.add(pedido);
        }

        for (Pedido pedido : pedidosConcluidos) {
            allPedidos.add(pedido);
        }
        
        if (allPedidos.isEmpty()) {
            throw new Exception("\nNão há nenhum pedido!");
        }

        return allPedidos;
    }

    public static Pedido mostrarPedidoPorId(int id) throws Exception{
        for (Pedido pedido : allPedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }

        throw new Exception(StringException());
    }
 
    public static ArrayList<Pedido> mostrarPedidosConcluidos() throws Exception {
        
        if (pedidosConcluidos.isEmpty()) {
            throw new Exception("\nPedidos concluídos está vazio!");
        }
        return pedidosConcluidos;
    }

    public static void removerPedidoConcluidoPeloId(int id) throws Exception{
        for (Pedido pedido : pedidosConcluidos) {
            
            if(pedido.getId() == id) {
                pedidosConcluidos.remove(pedido);
            }
        }

        throw new Exception(StringException());
    }

    public static void mostrarPedidosPendentes() throws Exception {
        
        if (pedidosPendentes.isEmpty()) {
            throw new Exception("\nPedidos pendentes está vazio!");
        }

        for (Pedido pedido : pedidosPendentes) {
            System.out.println(pedido.mostrarDados());
        }
    }

    public static void marcarPedidoComoConcluido(int id) throws Exception{
        for (Pedido pedido : pedidosPendentes) {
            if (pedido.getId() == id) {
                pedidosPendentes.remove(pedido);
                pedidosConcluidos.add(pedido);

                System.out.println("\nPedido marcado como concluído!");
                return;
            }
        }

        throw new Exception(StringException());
    }

    public static void fazerPedido(Pedido pedido) {
        pedidosPendentes.add(pedido);
    }

}