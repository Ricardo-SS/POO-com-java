public class Principal {
    public static void main(String[] args) {
        Aluno Livia = new Aluno("2021017108", "Lívia Beatriz", 5.0, 4.5, 7.0);

        System.out.println("A média do aluno é de " + Livia.media());
        System.out.println("O aluno precisa de " + Livia.provaFinal(Livia.media()));        
    }
}
