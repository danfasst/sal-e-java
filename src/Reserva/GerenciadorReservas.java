package Reserva;
import java.util.ArrayList;

public abstract class GerenciadorReservas {
    
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva adicionada com sucesso.");
    }

    public Reserva buscarReserva(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
    }

    public void removerReserva(int id) {
        Reserva reservaARemover = buscarReserva(id);
        if (reservaARemover != null) {
            reservas.remove(reservaARemover);
            System.out.println("Reserva removida com sucesso.");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            for (Reserva reserva : reservas) {
                reserva.mostrarDados();
            }
        }
    }

    public void editarReserva(int id, Reserva novaReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == id) {
                reservas.set(i, novaReserva);
                System.out.println("Reserva editada com sucesso.");
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    
}