import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matriz mtz = new Matriz();

        // System.out.println("Informe os valores de cada célula da tabela: ");
        
        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 2; j++){
        //         System.out.print("Célula["+ i +"]["+ j +"] <- ");
        //         mtz[i][j] = input.nextFloat();
        //     }   
        // }

        System.out.println(mtz + "\n");
        System.out.println("Determinante = " + mtz.calculaDeterminante());

        input.close();
    }
}
