import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3, CDU;

        System.out.print("Informe 3 números a seguir:\n - Centena: ");
        num1 = input.nextInt();

        System.out.print(" - Dezena: ");
        num2 = input.nextInt();

        System.out.print(" - Unidade:");
        num3 = input.nextInt();

        CDU = ((100 * num1) + (10 * num2) + num3);

        System.out.printf("\nFormato CDU = %d\n", CDU);

        CDU = ((100 * num3) + (10 * num1) + num2);

        System.out.printf("Formato UCD = %d\n\n", CDU);

        input.close();
    }
}
