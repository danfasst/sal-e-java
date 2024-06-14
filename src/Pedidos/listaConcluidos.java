package Pedidos;

import java.util.ArrayList;

public class listaConcluidos extends GerenciadorPedidos {
    
    private static ArrayList<Pedido> listaConcluidos = new ArrayList<>();

    @Override
    public void exibirDados() {
        for (Pedido pedido : listaConcluidos) {
            System.out.println();
        }
    }

    @Override
    public void removerPedidoLista() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerPedidoLista'");
    }

    @Override
    public void adicionarPedido(Pedido pedido) throws Exception {
        
        if(pedido == null) { throw new Exception(""); }
    }

    

}
