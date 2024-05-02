import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int carta, naipe;

        System.out.print("Insira um número qualquer de 1 a 13: ");
        carta = input.nextInt();

        System.out.print("Agora insira um número qualquer de 1 a 4: ");
        naipe = input.nextInt();

        System.out.printf("\nA carta com base nos números é um ");

        switch(carta){
            case 1:
                System.out.print("ÁS de ");
                break;
            case 2:
                System.out.print("DOIS de ");
                break;
            case 3:
                System.out.print("TRÊS de ");
                break;
            case 4:
                System.out.print("QUATRO de ");
                break;
            case 5:
                System.out.print("CINCO de ");
                break;
            case 6:
                System.out.print("SEIS de ");
                break;
            case 7:
                System.out.print("SETE de ");
                break;
            case 8:
                System.out.print("OITO de ");
                break;
            case 9:
                System.out.print("NOVO de ");
                break;
            case 10:
                System.out.print("DEZ de ");
                break;
            case 11:
                System.out.print("VALETE de ");
                break;
            case 12:
                System.out.print("DAMA de ");
                break;
            case 13:
                System.out.print("REI de ");
                break;
        }

        if(naipe == 1){
            System.out.print("OURO. ");
        } else if(naipe == 2){
            System.out.print("PAUS. ");
        } else if(naipe == 3){
            System.out.print("COPAS. ");
        } else {
            System.out.print("ESPADAS. ");
        } 

        input.close();
    }
}
