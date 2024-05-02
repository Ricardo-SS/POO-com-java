import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Para o fatorial, digite um número: ");
        num = input.nextInt();

        // for(int i = 0; i <= num; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("\t");
        //     }
        //     System.out.println(i + "! = " + fatorialRecur(i));
        // }

        fatorialRecur(num);

        input.close();
    }

    public static int fatorialRecur(int numero){
        int fat;

        if(numero == 0){
            System.out.print(numero + "! = 1\n");

            return 1;
        }

        fat = numero * fatorialRecur(numero - 1);

        for(int i = 0; i < numero; i++){
            System.out.print("\t");
        }

        System.out.print(numero + "! = "+ fat + "\n");

        return fat;
    }
}


