import java.util.Scanner;

public class Questao04 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        float grauC;

        System.out.print("Informe a temperatura em Celcius para ser convertida em Fahrenheit: ");
        grauC = input.nextFloat();

        System.out.printf("\n-> %.1f °C equivale a %.1f °F.\n\n", grauC, (((grauC * 9)/5) + 32));

        input.close();
    }
}
