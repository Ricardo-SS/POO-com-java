// 8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores:
// No setor de Eletros, que possui código 222, todas as peças que custam mais de R$ 500 vão ter 10% de desconto.
//No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
//Escreva um programa que recebe do usuário o código do setor da loja e o valor original de um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.

package PrimeiraUnidade.lista;

import java.util.Scanner;

public class q8vendas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o codigo do setor: ");
    int codigo = input.nextInt();

    if (codigo == 222 || codigo == 111) {
      System.out.print("Digite o valor do produto: ");
      double preco = input.nextDouble();
      double novoPreco;
      if (codigo == 222 && preco > 500) {
        novoPreco = preco - (preco * 0.1);
        System.out.println("Setor eletros");
        System.out.print("Preço com desconte: " + novoPreco);
      }
      if (codigo == 111) {
        System.out.println("Setor Cama, mesa e banho");
        if (preco > 100) {
          novoPreco = preco - (preco * 0.4);
          System.out.print("Preço com desconte: " + novoPreco);
        }
        if (preco >= 50 && preco <= 100) {
          novoPreco = preco - (preco * 0.2);
          System.out.print("Preço com desconte: " + novoPreco);
        }
        if (preco < 50) {
          novoPreco = preco - (preco * 0.1);
          System.out.print("Preço com desconte: " + novoPreco);
        }
      }
    } else {
      System.out.println("Setor invalido");
    }

    input.close();
  }
}