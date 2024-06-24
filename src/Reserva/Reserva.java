package Reserva;
import Entidade.Entidade;

public class Reserva extends Entidade {

    private int quantidadePessoas;
    private String dataReserva;
    private int numeroMesa;

    public Reserva(int id, String nome, int quantidadePessoas, String dataReserva, int numeroMesa) {

        super(id, nome);
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.numeroMesa = numeroMesa;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nID: " + id + "\nNome: " + nome + "\nQuantidade de Pessoas: " + quantidadePessoas + "\nData da Reserva: " + dataReserva + "\nNúmero da Mesa: " + numeroMesa);
    }
}