import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int dia;

        System.out.print("Informe um número de um dia Fevereiro: ");
        dia = input.nextInt();

        if(dia < 1 || dia > 28){
            System.out.print("\nNúmero incorreto!");
            System.exit(1);
        }

        while(dia > 7){
            dia -= 7;
        }

        System.out.printf("O dia %d corresponde a ", dia);

        if(dia == 1){
            System.out.printf("um Domingo. \n");
        } else if(dia == 2){
            System.out.printf("uma Segunda-Feria. \n");
        } else if(dia == 3){
            System.out.printf("uma Terça-Feria. \n");
        } else if(dia == 4){
            System.out.printf("uma Quarta-Feria. \n");
        } else if(dia == 5){
            System.out.printf("uma Quinta-Feria. \n");
        } else if(dia == 6){
            System.out.printf("uma Sexta-Feria. \n");
        } else {
            System.out.printf("um Sábado. \n");
        }

        input.close();
    }
}
