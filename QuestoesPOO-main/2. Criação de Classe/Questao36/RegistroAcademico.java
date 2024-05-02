public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;
    private String nome;
    private int matricula;
    private int codigoCurso;

    public RegistroAcademico(String nome, int codigoCurso) {
        this.nome = nome;
        this.matricula = numeroDeMatriculas + 1;
        this.codigoCurso = codigoCurso;
        numeroDeMatriculas++;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public static int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }


}
