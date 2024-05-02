public class Questao01 {
    public static void main(String[] args) {
        int centena = 0;
        int dezena = 0;
        int unidade = 0;
        double soma;
        int i;

        for(i = 100; i <= 999; i++){
           centena = i / 100;
           dezena = (i - (centena *100))/10;
           unidade = i - (centena * 100) - (dezena * 10);

           soma = (Math.pow(centena, 3)) + (Math.pow(dezena, 3)) + (Math.pow(unidade, 3));

           if(soma == i){
                System.out.println(i);
           }
        }
    }
}
