public class Aluno {
    private String matricula;
    private String nome;
    private double notaP1;
    private double notaP2;
    private double notaT1;

    public Aluno(String matricula, String nome, double notaP1, double notaP2, double notaT1) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaT1 = notaT1;
    }

    public double media(){
        return (((notaP1 + notaP2) * 2.5) + (notaT1 * 2)) / ((2.5*2) + 2);
    }

    public double provaFinal(double media){
        if(media < 7){
            return (50 - media * 6)/4; 
        } else {
            return 0.0;
        }
    }
}
