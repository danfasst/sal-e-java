package Pedidos;
import java.util.ArrayList;
import Pratos.Prato;

public class Pedido {
    
    private int id;
    private ArrayList<Prato> pratos;

    public Pedido(int id) {
        this.id = id;
        this.pratos = new ArrayList<>();
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

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public String mostrarDados() {
        return "\nId " + id + "\nPratos:\n" + pratos;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", pratos=" + pratos + "]";
    }

}