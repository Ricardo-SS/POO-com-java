import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test;
        int num;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        test = primo(num, 2); 

        if(test){
            System.out.print("É primo!");
        } else {
            System.out.print("Não é primo!");
        }

        input.close();
    }

    public static boolean primo(int numero, int div){
        if(numero == 2){
            return true;
        } else if(numero % div == 0){
            return false;
        } else if(div >= Math.sqrt(numero)){
            return true;
        }

        return primo(numero, div + 1);
    }
}
