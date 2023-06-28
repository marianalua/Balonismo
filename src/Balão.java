import Combustivel.Combustivel;

public class Balão {

    // Atributos
    private int id;
    private String registros;
    private String cor;
    private String tipo;
    private double altura;
    private double peso;
    private int capacidade;
    private double valorBalao;

    // Construtores
    public Balão() {
        // Construtor padrão
    }

    public Balão(int id, String registros, String cor, String tipo, double altura, double peso, int capacidade, double valorBalao) {
        this.id = id;
        this.registros = registros;
        this.cor = cor;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.capacidade = capacidade;
        this.valorBalao = valorBalao;
    }

    public Balão(String registros, String cor, double altura, double peso) {
        this.registros = registros;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        // Defina os demais atributos com valores padrão ou nulos
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistros() {
        return registros;
    }

    public void setRegistros(String registros) {
        this.registros = registros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorBalao() {
        return valorBalao;
    }

    public void setValorBalao(double valorBalao) {
        this.valorBalao = valorBalao;
    }

    // Métodos
    public String voar(Combustivel gasPropano) {
        return "Voando com " + gasPropano;
    }
}

 