package PrimeiraUnidade.lista.Encasulamento.q28lampada;
// 28. Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desli-
// gado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
// um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
// contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
// isso, utilize uma instância da classe Contador criada anteriormente e implemente a ló-
// gica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
// as capacidades da classe criada.

import PrimeiraUnidade.lista.Encasulamento.q27contador.Contador;

public class Lampada {
    private String estadoDaLampada; // Pode ser "ligado" ou "desligado"
    private Contador contadorAcessos; // Contador para rastrear quantas vezes a lâmpada foi acesa

    public Lampada() {
        this.estadoDaLampada = "desligado"; // Inicialmente, a lâmpada está desligada
        this.contadorAcessos = new Contador(); // Inicializa o contador
    }

    public void acende() {
        this.estadoDaLampada = "ligado";
        this.contadorAcessos.incrementar(); // Incrementa o contador de acessos
    }

    public void apaga() {
        this.estadoDaLampada = "desligado";
    }

    public void mostraEstado() {
        System.out.println("A lâmpada está " + this.estadoDaLampada);
    }

    public boolean estaLigada() {
        return this.estadoDaLampada.equals("ligado");
    }

    public int getQuantidadeAcessos() {
        return this.contadorAcessos.getValor();
    }
}
