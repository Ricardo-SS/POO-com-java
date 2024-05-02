package PrimeiraUnidade.lista.Encasulamento.q31registroAcademico;

public class TesteRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico();
        RegistroAcademico aluno2 = new RegistroAcademico();
        RegistroAcademico aluno3 = new RegistroAcademico();

        System.out.println("Matrícula do aluno 1: " + aluno1.getMatricula()); // Deve imprimir 1
        System.out.println("Matrícula do aluno 2: " + aluno2.getMatricula()); // Deve imprimir 2
        System.out.println("Matrícula do aluno 3: " + aluno3.getMatricula()); // Deve imprimir 3
    }
}
