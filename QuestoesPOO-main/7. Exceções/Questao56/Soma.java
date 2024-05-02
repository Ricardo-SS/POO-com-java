import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int num1, num2;

        num1 = obterIntValido();
        num2 = obterIntValido();

        System.out.println("\nA soma dos dois números é igual a " + (num1 + num2) + ".");
    }

    public static int obterIntValido(){
        Scanner input = new Scanner(System.in);
        int num = 0;

        try {
            System.out.print("Insira um número inteiro: ");
            num = input.nextInt();
        } catch (Exception e) {
            System.out.println("\n" + e);
            System.out.println("Número incorreto!!!");
            return obterIntValido();
        } finally {
            input.close();
        }

        return num;
    }
}