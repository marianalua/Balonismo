import Combustivel.Combustivel;

public class Main {
    public static void main(String[] args) {
        // Construir objetos e atribuir valores aos atributos

        // Construir um balão utilizando o construtor padrão
        Balão balao1 = new Balão();
        balao1.setId(1);
        balao1.setRegistros("ABC123");
        balao1.setCor("Prata");
        balao1.setTipo("Modelo 5 Plus");
        balao1.setAltura(50.0);
        balao1.setPeso(500.0);
        balao1.setCapacidade(4);
        balao1.setValorBalao(2000.0);

        // Construir um balão utilizando o construtor que solicita todos os dados
        Balão balao2 = new Balão(2, "DEF456", "Vermelho", "Modelo J", 60.7, 600.0, 6, 2500.0);

        // Construir um balão utilizando o construtor personalizado
        Balão balao3 = new Balão("GHI789", "Preto", 70.9, 700.0);

        // Construir uma pessoa utilizando o construtor padrão
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mariana ");
        pessoa1.setCpf("345.986.123.20");
        pessoa1.setRg("987654321");
        pessoa1.setTelefone(12345678);
        pessoa1.setTelefoneContatoFamiliar(1640028922);
        pessoa1.setAssinatura("mariana batista");

    }
}