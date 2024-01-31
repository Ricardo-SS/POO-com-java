// 15. Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.

public class q15numPerfeito {
    public static void main (String[] args){
        int cont = 0;

        for (int i = 1; cont < 4; i++) {
            if (ePerfeito(i)) {
                System.out.println(i);
                cont++;
            }
        }
    }

    public static boolean ePerfeito(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}