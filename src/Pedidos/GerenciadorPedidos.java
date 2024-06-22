package Pedidos;
import java.util.ArrayList;
import Pratos.Prato;

public abstract class GerenciadorPedidos {

    private ArrayList<Pedido> pedidosPendentes;
    private ArrayList<Pedido> pedidosConcluidos;
    private ArrayList<Pedido> allPedidos;

    public GerenciadorPedidos() {
        pedidosPendentes = new ArrayList<>();
        pedidosConcluidos = new ArrayList<>();
    }

    public String StringException() {
        return "\nPedido não encontrado!";
    }

    public ArrayList<Pedido> allPedidos() throws Exception{
        for (Pedido pedido : pedidosPendentes) {
            allPedidos.add(pedido);
        }

        for (Pedido pedido : pedidosConcluidos) {
            allPedidos.add(pedido);
        }
        
        if (allPedidos == null) {
            throw new Exception("\nNão há nenhum pedido!");
        }

        return allPedidos;
    }

    public Pedido mostrarPedidoPorId(int id) throws Exception{
        for (Pedido pedido : allPedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }

        throw new Exception(StringException());
    }
 
    public ArrayList<Pedido> mostrarPedidosConcluidos() throws Exception {
        
        if (pedidosConcluidos == null) {
            throw new Exception("\nPedidos concluídos está vazio!");
        }
        return pedidosConcluidos;
    }

    public void removerPedidoConcluidoPeloId(int id) throws Exception{
        for (Pedido pedido : pedidosConcluidos) {
            
            if(pedido.getId() == id) {
                pedidosConcluidos.remove(pedido);
            }
        }

        throw new Exception(StringException());
    }

    public ArrayList<Pedido> mostrarPedidosPendentes() throws Exception {
        
        if (pedidosPendentes == null) {
            throw new Exception("\nPedidos pendentes está vazio!");
        }
        return pedidosPendentes;
    }

    public void editarPedidoPeloId(int id, ArrayList<Prato> novosPratos) throws Exception{
        for (Pedido pedido : pedidosPendentes) {
            if (pedido.getId() == id) {
                pedido.setPratos(novosPratos);
                return;
            }
        }

        throw new Exception(StringException());
    }

    public void marcarPedidoComoConcluido(int id) throws Exception{
        for (Pedido pedido : pedidosPendentes) {
            if (pedido.getId() == id) {
                pedidosPendentes.remove(pedido);
                pedidosConcluidos.add(pedido);
                return;
            }
        }

        throw new Exception(StringException());
    }

    public void fazerPedido(Pedido pedido) {
        pedidosPendentes.add(pedido);
    }

}