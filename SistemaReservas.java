import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Reserva> reservas;

    public SistemaReservas() {
        this.reservas = new ArrayList<>();
    }

    public boolean adicionarReserva(Reserva reserva) {
        if (!verificarConflito(reserva)) {
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    public boolean cancelarReserva(int id) {
        return reservas.removeIf(reserva -> reserva.getId() == id);
    }

    public List<Reserva> buscarReservasPorCliente(String cpf) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCpf().equals(cpf)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    private boolean verificarConflito(Reserva novaReserva) {
        for (Reserva r : reservas) {
            if (r.getSala().getCodigo().equals(novaReserva.getSala().getCodigo())) {
                boolean conflito = !(novaReserva.getDataHoraFim().isBefore(r.getDataHoraInicio()) ||
                        novaReserva.getDataHoraInicio().isAfter(r.getDataHoraFim()));
                if (conflito) return true;
            }
        }
        return false;
    }
}
