import Combustivel.Combustivel;

public class Main {
        public static void main(String[] args) {

            // Construir balão
            Balão b1 = new Balão();

            // Acinar voo do balão

            // Chamada do método voar()
            String resposta = b1.voar(new Combustivel());

            // Apresentação do retorno
            System.out.println(resposta);
            Balão b2 = new Balão();
            Combustivel alcool = new Combustivel();
            System.out.println(b2.voar(alcool));
        }
    }
}