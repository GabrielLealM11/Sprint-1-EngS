import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Sala sala1 = new Sala("SALA_A101", 10, Arrays.asList("Projetor", "Videoconferência"));
        Cliente cliente1 = new Cliente("João Silva", "12345678900", true);

        LocalDateTime inicio = LocalDateTime.of(2025, 4, 1, 14, 0);
        LocalDateTime fim = LocalDateTime.of(2025, 4, 1, 16, 0);

        Reserva reserva1 = new Reserva(cliente1, sala1, inicio, fim);

        if (sistema.adicionarReserva(reserva1)) {
            System.out.println("Reserva realizada com sucesso!");
            System.out.println("Custo total: R$" + reserva1.getCustoTotal());
        } else {
            System.out.println("Conflito de horário! Reserva não realizada.");
        }
    }
}
