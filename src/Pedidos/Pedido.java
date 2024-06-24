package Pedidos;
import java.util.ArrayList;
import Pratos.Prato;

public class Pedido {
    
    private int id = 1;
    private ArrayList<Prato> pratos;

    public Pedido() {
        this.pratos = new ArrayList<>();
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(Prato prato) {
        pratos.add(prato);
    }

    public String mostrarDados() {
        return "\nId " + id + "\nPratos:\n" + pratos;
    }

}