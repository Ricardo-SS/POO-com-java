package ExemplosEmAula.reuso.universidade;

public class demoUniversidade {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao joao = new RegistroAcademicoPosGraduacao(nomeDoAluno: "Joao", matricula: "202222222", curso: "BTI", tituloTese: "poo", orientado: "qualquer");
        System.out.println(joao);
    }
}
