package PrimeiraUnidade.lista.Encasulamento.q28lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada minhaLampada = new Lampada();

        minhaLampada.acende();
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está ligado"
        System.out.println("Quantidade de acessos: " + minhaLampada.getQuantidadeAcessos());

        minhaLampada.apaga();
        minhaLampada.mostraEstado(); // Deve imprimir "A lâmpada está desligado"
        System.out.println("Quantidade de acessos: " + minhaLampada.getQuantidadeAcessos());
    }
}
