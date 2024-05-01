package PrimeiraUnidade.lista.criacaoDeClasses.q26elevador;

public class TestarElevador {
    public static void main(String[] args) {
        // Criando um objeto da classe Elevador
        Elevador elevador = new Elevador(0, 10, 0, 5);

        // Testando o método Entrar
        elevador.Entrar(3);
        System.out.println("Total de pessoas no elevador após entrar: " + elevador.getTotalPessoas());

        // Testando o método Sair
        elevador.Sair(1);
        System.out.println("Total de pessoas no elevador após sair: " + elevador.getTotalPessoas());

        // Testando o método sobe
        elevador.sobe(5);
        System.out.println("Andar atual após subir: " + elevador.getAndarAtual());

        // Testando o método desce
        elevador.desce(1);
        System.out.println("Andar atual após descer: " + elevador.getAndarAtual());
    }
}
