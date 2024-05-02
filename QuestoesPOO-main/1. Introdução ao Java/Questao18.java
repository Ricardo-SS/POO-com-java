public class Questao18 {
    public static void main(String[] args){
        System.out.print(" = " + potencia(4, 4));
    }

    public static int potencia(int base, int expoente){
        if(expoente == 1){
            System.out.print(" " + base);
            return base;
        }
        
        System.out.print(" " + base + " *");
        return base * potencia(base, expoente - 1);
    }
}
