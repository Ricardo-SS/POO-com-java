import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        TreeMap<Character, Integer> mapa = new TreeMap<>();

        String frase = "HELLO THERE";
        char[] letras = frase.toCharArray();

        int quant;
        for (char letra : letras) {
            if(letra == ' '){
                continue;
            } else if(mapa.containsKey(letra)){
                quant = mapa.get(letra);
                mapa.put(letra, quant + 1);
            } else {
                mapa.put(letra, 1);
            }
        }

        for (char letra : mapa.keySet()) {
            System.out.println(letra + " -> " + mapa.get(letra));
        }
    }
}
