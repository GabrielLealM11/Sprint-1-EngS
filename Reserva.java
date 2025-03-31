import java.time.LocalDateTime;
import java.time.Duration;

public class Reserva {
    private static int contador = 1;
    private int id;
    private Cliente cliente;
    private Sala sala;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private double custoTotal;

    public Reserva(Cliente cliente, Sala sala, LocalDateTime inicio, LocalDateTime fim) {
        this.id = contador++;
        this.cliente = cliente;
        this.sala = sala;
        this.dataHoraInicio = inicio;
        this.dataHoraFim = fim;
        this.custoTotal = calcularCusto();
    }

    private double calcularCusto() {
        long horas = Duration.between(dataHoraInicio, dataHoraFim).toHours();
        double custo = horas * 50.0;
        if (cliente.isCorporativo()) {
            custo *= 0.90; // 10% de desconto
        }
        return custo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Sala getSala() {
        return sala;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public double getCustoTotal() {
        return custoTotal;
    }
}
