public class Piloto {
    // Atributos
    private String nome;
    private String cpf;
    private int numeroAnac;

    // Construtores
    public Piloto() {
        // Construtor padrão
    }

    public Piloto(String nome, String cpf, int numeroAnac) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroAnac = numeroAnac;
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

    public int getNumeroAnac() {
        return numeroAnac;
    }

    public void setNumeroAnac(int numeroAnac) {
        this.numeroAnac = numeroAnac;
    }
}
