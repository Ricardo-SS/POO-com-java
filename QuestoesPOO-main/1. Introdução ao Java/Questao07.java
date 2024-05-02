import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double menor, num1, num2, num3;

        System.out.print("Informe o primeiro número: ");
        num1 = input.nextDouble();
        menor = num1;

        System.out.print("Informe o segundo número: ");
        num2 = input.nextDouble();

        if(menor > num2){
            menor = num2;
        }

        System.out.print("Informe o terceiro número: ");
        num3 = input.nextDouble();

        if(menor > num3){
            menor = num3;
        }

        System.out.printf("Dos número digitados (%.1f, %.1f, %.1f) o menor é %.1f.", num1, num2, num3, menor);

        input.close();
    }
}
