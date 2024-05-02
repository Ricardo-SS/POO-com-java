import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float nota1, nota2, nota3, soma;

        System.out.print("Informe o primeiro número: ");
        nota1 = input.nextFloat();

        System.out.print("Informe o segundo número: ");
        nota2 = input.nextFloat();

        System.out.print("Informe o terceiro número: ");
        nota3 = input.nextFloat();

        soma = nota1 + nota2 + nota3;

        System.out.printf("\nA soma dos números digitados(%.1f, %.1f e %.1f) é igual a %.1f.\n", nota1, nota2, nota3, soma);
        System.out.printf("A média aritmétrica dos números digitados (%.1f, %.1f e %.1f) é igual a %.2f.\n\n", nota1, nota2, nota3, (soma/3));
    
        input.close();
    }
}
