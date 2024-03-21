package PrimeiraUnidade.lista;
import java.util.Scanner;

public class q14fibonaci {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();
        long fib = 0;
        long aux = 1;

        if (n > 0) {
          System.out.println("A série de Fibonacci até o " + n + "-ésimo termo é:");
            for (int i = 0; i < n; i++) {
              System.out.println(fib + " ");
              long aux2 = fib + aux;
              fib = aux;
              aux = aux2;
            }
        }
        input.close();
    }
}
