package Pedidos;

import java.util.ArrayList;
import Pratos.Prato;

public class Pedido {

    private ArrayList<Prato> listaPedido;

    public Pedido() {
        listaPedido = new ArrayList<Prato>();
    }

    public void adicionarPrato(Prato prato) throws Exception {
        
        if (prato == null) { throw new Exception("\nNão tem prato!"); }

        listaPedido.add(prato);

        System.out.println("\nUm novo prato foi adicionado no seu pedido!");
    }

    public ArrayList<Prato> getPedido() {
        return listaPedido;
    }

}
