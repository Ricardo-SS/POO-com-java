import java.util.Scanner;

public class Questao01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float base, altura;

        System.out.print("Informe o tamanho da base do quadrado: ");
        base = input.nextFloat();

        System.out.print("Informe o tamanho da altura do quadrado: ");
        altura = input.nextFloat();

        System.out.printf("A área do quadrado com base %f e altura %f é de %f.\n\n", base, altura, (base * altura));

        input.close();
    }
}