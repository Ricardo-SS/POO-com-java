public class Principal {
    public static void main(String[] args) {
        Generica <Integer> numGenericos1 = new Generica<>(5, 5, 5);
        System.out.println(numGenericos1.toString());
        System.out.println(numGenericos1.quantSaoIguais() + " são iguais.\n");

        Generica <Integer> numGenericos2 = new Generica<>(5, 5, 3);
        System.out.println(numGenericos2.toString());
        System.out.println(numGenericos2.quantSaoIguais() + " são iguais.\n");
        
        Generica <Integer> numGenericos3 = new Generica<>(5, 3, 5);
        System.out.println(numGenericos3.toString());
        System.out.println(numGenericos3.quantSaoIguais() + " são iguais.\n");
        
        Generica <Integer> numGenericos4 = new Generica<>(3, 5, 5);
        System.out.println(numGenericos4.toString());
        System.out.println(numGenericos4.quantSaoIguais() + " são iguais.\n");

        Generica <Integer> numGenericos5 = new Generica<>(3, 4, 5);
        System.out.println(numGenericos5.toString());
        System.out.println(((numGenericos5.quantSaoIguais() == 0)? "Nenhum" : numGenericos5.quantSaoIguais()) + " são iguais.\n");
    }
}
