import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numMes = input.nextInt();

        identificaMes(numMes);

        input.close();
    }

    public static void identificaMes(int numMes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        try {
            System.out.println("O mês correspondente é: " + meses[numMes - 1]);
        } catch (Exception e) {
            System.out.println("Este mês não existe!!!");
        }
    }
}
