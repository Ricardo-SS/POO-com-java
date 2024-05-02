package PrimeiraUnidade.lista.Encasulamento.q27contador;

//27. Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
// Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
// com que o acesso ao valor seja feito através de métodos que devem zerar, incremen-
// tar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
// capacidades da classe criada.

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }
}


