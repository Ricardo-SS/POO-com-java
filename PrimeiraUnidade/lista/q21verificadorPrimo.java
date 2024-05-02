package PrimeiraUnidade.lista;
// 21. Crie uma função recursiva que verifique se um dado número é primo.
public class q21verificadorPrimo {

    public static void main(String[] args) {
        int numero = 17; // Altere o número aqui para verificar se é primo
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        return ehPrimoRecursivo(numero, 2);
    }

    private static boolean ehPrimoRecursivo(int numero, int divisor) {
        if (divisor >= numero) {
            // Base case: Se chegamos ao próprio número, é primo
            return true;
        }
        if (numero % divisor == 0) {
            // Se o número é divisível pelo divisor atual, não é primo
            return false;
        }
        // Verifica o próximo divisor
        return ehPrimoRecursivo(numero, divisor + 1);
    }
}
