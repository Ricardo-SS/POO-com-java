import java.util.Random;

public class DadoDeSeis {
    public static int rodar(){
        Random gerador = new Random();

        return (gerador.nextInt(6) + 1);
    }
}
