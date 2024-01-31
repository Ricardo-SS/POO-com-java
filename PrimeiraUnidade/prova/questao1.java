package PrimeiraUnidade.prova;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        double valor;
        int codigo;
        String setor = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Codido do setor: ");
        codigo = sc.nextInt();
        System.out.println("Valor do produto: ");
        valor = sc.nextDouble();
        sc.close();

        switch (codigo) {
            case 111:
                setor = "Cama, mesa e banho";
                if (valor > 100) {
                    valor *= 0.60;
                } else if (valor > 50) {
                    valor *= 0.7;
                } else {
                    valor *= 0.9;
                }
                break;

            case 222: 
                setor = "Eletros";
                if (valor > 500) valor *= 0.9;
        
            default:
    
                // return = "Setor invalido"
                break;
        }

    }
}


// incompleta