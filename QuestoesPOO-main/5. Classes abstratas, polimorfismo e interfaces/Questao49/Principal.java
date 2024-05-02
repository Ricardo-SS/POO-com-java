public class Principal {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Livia Beatriz");
        Funcionario func2 = new Funcionario("Geisa Morais", 10.50);

        System.out.println("Funcionarios(as):\n" + func1 + "\n" + func2);

        func1.setId(1);
        func1.setTurno("Noite");
        func1.reajusteSalario(15.90);

        func2.setId(2);
        func2.setTurno("Madrugada");
        
        System.out.println("\nFuncionarios(as):\n" + func1 + "\n" + func2);
    }    
}
