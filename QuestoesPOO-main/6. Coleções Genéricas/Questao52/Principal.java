import java.util.Arrays;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        String[] caracteres = {"L", "e", "o", "n", "a", "r", "d", "o", "2", "0"};

        LinkedList<String> nome = new LinkedList<>(Arrays.asList(caracteres));
        LinkedList<String> nomeInvertido = new LinkedList<>();
        System.out.println("Normal -> " + nome);

        for (String string : nome) {
            nomeInvertido.addFirst(string);
        }

        System.out.println("Invertida -> " + nomeInvertido);
    }   
}
