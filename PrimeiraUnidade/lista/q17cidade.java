package PrimeiraUnidade.lista;
// 17. Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
// cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
// cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quanti-
// dade de anos necessária para que a população da cidade A seja maior ou igual a popu-
// lação da cidade B
public class q17cidade {
  public static void main(String[] args){
    int populacaoA = 7000;
    int populacaoB = 20000;
    double crecimentoA = 0.035; //3.5%
    double crecimentoB = 0.01;  //1%
    int anos = 0;

    while (populacaoA < populacaoB) {
      populacaoA += (int) (populacaoA * crecimentoA);
      populacaoB += (int) (populacaoB * crecimentoB);
      anos++;
    }
    System.out.println("Após " + anos + " anos a populacao da cidade A será maior que a populacao da cidade B");
    System.out.println("População de A: " + populacaoA);
    System.out.println("População de B: " + populacaoB);
  }
}
