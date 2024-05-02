import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quant;
        
        System.out.print("Digite a quantidade de parâmetros: ");
        quant = input.nextInt();

        int vet[] = new int[quant];

        System.out.print("\nInforme os parâmetros a seguir:\n");

        for(int i = 0; i < quant; i++){
            System.out.print(("\t") + (i + 1) + "º - ");
            vet[i] = input.nextInt();
        }

        System.out.print("\n\t" + polinomio(5, quant, vet)); 

        input.close();
    }

    public static int polinomio(int x, int n, int[] param){
        if(n == 0){
            return 0;
        }

        return x * polinomio(x, n-1, param) + param[n - 1];
    }
}
