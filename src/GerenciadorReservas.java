import java.util.ArrayList;

public abstract class GerenciadorReservas {
    protected ArrayList<Reserva> reservas = new ArrayList<>();

    public abstract void adicionarReserva(Reserva reserva);
    public abstract void removerReserva(int ID);
    public abstract void mostrarReservas();
    public abstract void editarReserva(int ID, Reserva novaReserva);
}
