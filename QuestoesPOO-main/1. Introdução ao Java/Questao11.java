import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.print("Informe a primeira coordenada:\n\tx1: ");
        x1 = input.nextDouble();
        
        System.out.print("\ty1: ");
        y1 = input.nextDouble();

        System.out.print("Informe a segunda coordenada:\n\tx2: ");
        x2 = input.nextDouble();

        System.out.print("\ty2: ");
        y2 = input.nextDouble();
        
        System.out.print("A coordenada ("+ x1 + ", " + y1 + ") está");

        if(x1 != x2){
            if(x2 > x1){
                System.out.print(" a direita");
            } else {
                System.out.print(" a esquerda");
            }    
        }

        System.out.print(" e ");

        if(y1 != y2){
            if(y2 > y1){
                System.out.print(" a acima");
            } else {
                System.out.print(" a abaixo");
            }
        }

        if(x1 == x2 && y1 == y2){
            System.out.print("na mesma coordenada de ("+ x2 + ", " + y2 + "). ");
        } else {
            System.out.print(" coordenada ("+ x2 + ", " + y2 + "). ");
        }

        input.close();
    }
}


/*
    Escreva um programa que lê dois pontos no plano cartesiano com coordenadas
    x e y e informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita
    do primeiro.
 */