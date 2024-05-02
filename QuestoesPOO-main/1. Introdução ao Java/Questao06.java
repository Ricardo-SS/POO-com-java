import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int min, ano = 0, mes = 0, semana = 0, dia = 0, hora = 0;

        System.out.print("Insira um número aleatório de minutos: ");
        min = input.nextInt();
        
        while(min >= 525600){
            min -= 525600;
            ano++;
        }

        while(min >= 43800){
            min -= 43800;
            mes++;
        }
        
        while(min >= 10080){
            min -= 10080;
            semana++;
        }

        while(min >= 1440){
            min -= 1440;
            dia++;
        }

        while(min >= 60){
            min -= 60;
            hora++;
        }

        System.out.printf("%d minutos é equivalente a %d anos, %d meses, %d semanas, %d dias, %d horas %d minutos.\n\n", min, ano, mes, semana, dia, hora, min);

        input.close();
    }
}
