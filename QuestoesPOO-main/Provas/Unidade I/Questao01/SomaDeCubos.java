public class SomaDeCubos {
    public static void main(String[] args) {
        int cent, dezn, unid;
        double soma;

        for(int i = 100; i < 1000; i++){
            cent = i/100;
            dezn = (i - (cent * 100)) / 10;
            unid = i - (cent * 100) - (dezn * 10);

            soma = Math.pow(cent, 3.0) + Math.pow(dezn, 3.0) + Math.pow(unid, 3.0);

            if(soma == i){
                System.out.println(i);
            }
        }
    }
}
