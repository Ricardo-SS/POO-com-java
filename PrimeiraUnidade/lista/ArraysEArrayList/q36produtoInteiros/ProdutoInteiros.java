// 36. Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados para método produto utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma com um número diferente de argumentos.

package PrimeiraUnidade.lista.ArraysEArrayList.q36produtoInteiros;

public class ProdutoInteiros {
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
}

