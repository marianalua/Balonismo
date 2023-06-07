import Combustivel.Combustivel;

public class Balão {
    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    int capacidade;
    double valorBalão;
    // Métodos
    public String voar(Combustivel gasPropano){
        return "voando com" + gasPropano;
    }
}
