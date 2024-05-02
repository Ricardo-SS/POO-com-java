import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int terms, aux1 = 1, aux2 = 0, trash;

        System.out.print("Quantos números da série fibonnaci você quer saber: ");
        terms = input.nextInt();

        if(terms > 0){
            System.out.print(aux1);
        }

        for(int i = 1; i < terms; i++){
            trash = aux1;

            System.out.print(" " + (aux1 + aux2));

            aux1 += aux2;
            aux2 = trash;
        }

        input.close();
    }
}
