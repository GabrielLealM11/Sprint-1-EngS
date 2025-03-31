import java.util.List;

public class Sala {
    private String codigo;
    private int capacidade;
    private List<String> recursos;

    public Sala(String codigo, int capacidade, List<String> recursos) {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.recursos = recursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<String> getRecursos() {
        return recursos;
    }
}
