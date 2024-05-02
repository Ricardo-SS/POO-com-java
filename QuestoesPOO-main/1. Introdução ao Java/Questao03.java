import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float angulo;

        System.out.print("Informe valor do ângulo em graus: ");
        angulo = input.nextFloat();

        System.out.printf("\nO grau %.1f° convertido em radiano é igual a %.3frad.\n", angulo, (angulo * (Math.PI/180)));
        System.out.printf("Vale ressaltar algumas informações sobre o grau %.1f°: \n", angulo);
        System.out.printf("\tSeno: %f\n\tCosseno: %f\n\tTangente: %f\n\tCossecante: %f\n\tSecante: %f\n\tCotangente: %f\n\n", Math.sin(angulo), Math.cos(angulo), Math.tan(angulo), (1/Math.cos(angulo)), (1/Math.sin(angulo)), (1/Math.tan(angulo)));


        input.close();
    }
}
