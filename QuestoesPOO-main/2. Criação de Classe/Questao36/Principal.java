public class Principal {
    public static void main(String[] args) {
        System.out.println(RegistroAcademico.getNumeroDeMatriculas() + " realizadas!");
        
        RegistroAcademico aluno1 = new RegistroAcademico("Leonardo", 1);
        System.out.println(aluno1.getMatricula()); 

        RegistroAcademico aluno2 = new RegistroAcademico("Lívia", 2);
        System.out.println(aluno2.getMatricula()); 
        
        RegistroAcademico aluno3 = new RegistroAcademico("Geísa", 1);
        System.out.println(aluno3.getMatricula()); 

        System.out.println(RegistroAcademico.getNumeroDeMatriculas() + " realizadas!");
    }    
}
