import java.util.List;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.text.MaskFormatter;

public class Paciente {
    private String rg;
    private int idade;
    Random random = new Random();

    public Paciente() {
        this.rg = geraRG();
        this.idade = random.nextInt(100);
    }
    
    public int getIdade() {
        return idade;
    }

    private String geraRG(){
        LinkedList<Integer> listaAleatoria = new LinkedList<>();
        int n = 0;

        while(n == 0){
            for(int i = 0; i < 10; i++){
                listaAleatoria.add(random.nextInt(10));
            }

            if(autetica(listaAleatoria)){
                n = 1;
            } 
        }

        return finalRG(listaAleatoria);
    }

    private boolean autetica(List<Integer> lista){
        LinkedList<Integer> listaMultiplicada = new LinkedList<>();
        int totalSoma = 0;
        int peso = 2;

        for (int num : lista) {
            peso = peso == 100 ? peso = 100 : peso;

            listaMultiplicada.add(num * peso);
            
            peso++;
        }

        for (int num : listaMultiplicada) {
            totalSoma += num;
        }

        if(totalSoma % 11 == 0){
            return true;
        }

        return false;
    }

    private String finalRG(List<Integer> lista){
        String rg = "";
        String texto = "";

        for (int num : lista) {
            texto += num;
        }

        try {
            MaskFormatter mascara = new MaskFormatter("###.###.###");
            mascara.setValueContainsLiteralCharacters(false);
            rg = mascara.valueToString(texto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rg;
    }

    @Override
    public String toString() {
        return "Paciente de RG: " + rg + "\t Idade: " + idade;
    }
}
