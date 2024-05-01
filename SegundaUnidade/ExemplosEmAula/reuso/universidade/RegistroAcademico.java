package ExemplosEmAula.reuso.universidade;

public class RegistroAcademico {
    private String nomeDoAluno;
    private String matricula;
    private String curso;
    
    public RegistroAcademico(String nomeDoAluno, String matricula, String curso){
        this.nomeDoAluno = nomeDoAluno;
        this.nomeDoAluno = matricula;
        this.nomeDoAluno = curso;
    }

    public String toString(){
        String res = "";
        res += "Nome do aluno: " + nomeDoAluno;
        res += "Matricula: " + matricula;
        res += "Curso: " + curso;
        return res;
    }
}