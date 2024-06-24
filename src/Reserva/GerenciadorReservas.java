package Reserva;

import java.util.ArrayList;

public abstract class GerenciadorReservas {

    private static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva adicionada com sucesso.");
    }

    public static Reserva buscarReserva(int id) throws Exception {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }

        throw new Exception("\nReserva não encontrada!");
    }

    public static void removerReserva(int id) throws Exception {

        Reserva reservaARemover = buscarReserva(id);
        if (reservaARemover != null) {
            reservas.remove(reservaARemover);
            System.out.println("Reserva removida com sucesso.");
        }

        throw new Exception("\nReserva não encontrada.");

    }

    public static void mostrarReservas() throws Exception {
        if (reservas.isEmpty()) {
            throw new Exception("Nenhuma reserva encontrada.");
        }

        for (Reserva reserva : reservas) {
            reserva.mostrarDados();
        }

    }

    public static void editarReserva(int id, Reserva novaReserva) throws Exception {

        for (Reserva reserva : reservas) {

            if (reserva.getId() == id) {
                reserva.setNome(novaReserva.getNome());
                reserva.setNumeroMesa(novaReserva.getNumeroMesa());
                reserva.setDataReserva(novaReserva.getDataReserva());
                reserva.setQuantidadePessoas(novaReserva.getQuantidadePessoas());
                return;
            }
        }
        throw new Exception("\nReserva não encontrada.");
    }

}