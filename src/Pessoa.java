public class Pessoa {
    // Atributos
    private String nome;
    private String cpf;
    private String rg;
    private int telefone;
    private int telefoneContatoFamiliar;
    private String assinatura;

    // Construtores
    public Pessoa() {
        // Construtor padrão
    }

    public Pessoa(String nome, String cpf, String rg, int telefone, int telefoneContatoFamiliar, String assinatura) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.telefoneContatoFamiliar = telefoneContatoFamiliar;
        this.assinatura = assinatura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefoneContatoFamiliar() {
        return telefoneContatoFamiliar;
    }

    public void setTelefoneContatoFamiliar(int telefoneContatoFamiliar) {
        this.telefoneContatoFamiliar = telefoneContatoFamiliar;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }
}