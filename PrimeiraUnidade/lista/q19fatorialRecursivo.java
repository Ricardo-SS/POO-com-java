package PrimeiraUnidade.lista;

// 19. Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recur-
// siva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
// Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
// objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
// da recursão.

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
