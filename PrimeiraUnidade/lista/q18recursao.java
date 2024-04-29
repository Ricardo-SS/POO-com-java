// Crie uma função recursiva potencia(base,expoente)que, quando chamado, retorna base expoente. Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 81 nesse exemplo)
// Assuma que expoente é um inteiro maior ou igual a 1.
package PrimeiraUnidade.lista;

public class q18recursao {
  public static void main(String[] args){
    int base = 3;
    int expoente = 4;

    int resultado = potencia(base, expoente);
    System.out.println(base + " elevado a " + expoente + " =34 " + resultado);
  }

  // função recursiva
  public static int potencia(int base, int expoente){
    //caso base
    if(expoente == 1){
      return base;
    } else {
      return base * potencia(base, expoente -1);
    }
  }
}
