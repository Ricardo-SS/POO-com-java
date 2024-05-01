package PrimeiraUnidade.lista;

public class q19fatorialRecursivo {
  public static void main(String[] args){
    int n = 5;
    fatorial(n);
  }

  public static int fatorial(int n){
    if (n == 0){
      System.out.println("\t".repeat(n) + n + "! = 1");
      return 1;
    } else {
      int subFatorial = fatorial(n - 1);
      int resultado = n * subFatorial;
      System.out.println("\t".repeat(n) + n + "! = " + resultado);
      return resultado;
    }
  }
}
