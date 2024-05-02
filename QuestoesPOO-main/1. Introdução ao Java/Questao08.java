import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int cod;
        double preco;

        System.out.print("Informe primeiramente número do setor do item: ");
        cod = input.nextInt();

        System.out.print("Além disso, informe também o valor do produto: ");
        preco = input.nextDouble();

        if(cod == 111){
            if(preco > 100){
                preco -= (preco * 0.4);
            } else if(preco > 50 && preco <= 100){
                preco -= (preco * 0.2);
            } else {
                preco -= (preco * 0.1);
            }

            System.out.print("O valor do produto no setor de Cama, mesa e banho com um desconto especial será de " + preco + ".\n");
        } else if(cod == 222){
            if(preco > 500){
                preco -= (preco * 0.1);
            }

            System.out.print("O valor do produto no setor de Eletros com um desconto especial será de " + preco + ".\n");
        } else {
            System.out.print("\nSetor inválido!\n");
        }
        
        input.close();
    }
}
