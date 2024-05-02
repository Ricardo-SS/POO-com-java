package PrimeiraUnidade.lista.Encasulamento.q31registroAcademico;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0; // Campo estático para contar o número de matrículas
    private int matricula; // Atributo matrícula

    public RegistroAcademico() {
        // Incrementa o número de matrículas e atribui o valor à matrícula
        numeroDeMatriculas++;
        this.matricula = numeroDeMatriculas;
    }

    public int getMatricula() {
        return matricula;
    }
}
