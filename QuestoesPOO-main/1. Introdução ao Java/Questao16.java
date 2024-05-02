public class Questao16 {
    public static void main(String[] args){
        int unid, dezn, cent;
        double soma;

        for(int i = 100; i < 1000; i++){
            soma = 0;
            cent = i / 100;
            dezn = (i - (cent * 100)) / 10;
            unid = (i - (cent * 100) - (dezn * 10));

            soma = Math.pow(cent, 3) + Math.pow(dezn, 3) + Math.pow(unid, 3);

            if(soma == i){
                System.out.print(" " + i);
            }
        }
    }
}
