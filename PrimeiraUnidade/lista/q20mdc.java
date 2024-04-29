package PrimeiraUnidade.lista;

public class q20mdc {
  public static void main(String[] args) {
    int m = 24;
    int n = 18;
    System.out.println("O MDC de " + m + " e " + n + " é: " + mdc(m, n));
  }

  public static int mdc(int m, int n) {
    if (n > m) {
      return mdc(n, m);
    } else if (n == 0) {
      return m;
    } else {
      return mdc(n, m % n);
    }
  }

}
