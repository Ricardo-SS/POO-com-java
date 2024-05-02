import java.util.Scanner;

public class Matriz {
    private float[][] matriz;

    public Matriz() {
        // Scanner input = new Scanner(System.in);
        matriz = new float[2][2];

        // System.out.println("Informe os valores de cada célula da tabela: ");
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Célula["+ i +"]["+ j +"] <- " + (i + j + 1) + "\n");
                matriz[i][j] = i + j + 1;
                // matriz[i][j] = input.nextFloat();
            }   
        }

        // input.close();
    }

    public float calculaDeterminante(){
        return ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]));
    }

    public String toString(){
        String str = "";

        for(int i = 0; i < matriz.length; i++){
            str += "\n| ";
            for(int j = 0; j < matriz[0].length; j++){
                str += matriz[i][j] + " | ";
            }
        }

        return str;
    }
}
