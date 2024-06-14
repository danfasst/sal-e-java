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

    @Override
    public String mostrarDados() {
        return "id: " + id + ", Quantidade de Pessoas: " + quantidadePessoas + ", Data da Reserva: " + dataReserva + ", Número da Mesa: " + numeroMesa;
    }