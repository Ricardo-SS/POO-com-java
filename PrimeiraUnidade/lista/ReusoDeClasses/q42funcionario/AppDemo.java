package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class AppDemo {
    public static void main(String[] args) {
        // Criando objetos Funcionario, Assistente, Tecnico e Administrativo
        Funcionario funcionario = new Funcionario("João", 3000);
        Assistente assistente = new Assistente("Maria", 2500, 1001);
        Tecnico tecnico = new Tecnico("Pedro", 2800, 1002, 500);
        Administrativo administrativo = new Administrativo("Ana", 2700, 1003);

        // Aumentando o salário de alguns funcionários
        funcionario.aumentarSalario(500);
        assistente.aumentarSalario(300);

        // Exibindo informações dos funcionários
        System.out.println("Informações dos Funcionários:");
        System.out.println(funcionario);
        System.out.println(assistente);
        System.out.println(tecnico);
        System.out.println(administrativo);

        // Calculando e exibindo o ganho anual de alguns funcionários
        System.out.println("\nGanhos Anuais:");
        System.out.println("Ganho Anual de " + funcionario.getNome() + ": R$" + funcionario.ganhoAnual());
        System.out.println("Ganho Anual de " + assistente.getNome() + ": R$" + assistente.ganhoAnual());
        System.out.println("Ganho Anual de " + tecnico.getNome() + ": R$" + tecnico.ganhoAnual());
        System.out.println("Ganho Anual de " + administrativo.getNome() + ": R$" + administrativo.ganhoAnual());
    }
}

