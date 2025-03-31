public class Cliente {
    private String nome;
    private String cpf;
    private boolean corporativo;

    public Cliente(String nome, String cpf, boolean corporativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.corporativo = corporativo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isCorporativo() {
        return corporativo;
    }
}
