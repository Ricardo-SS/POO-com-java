public class Questao13 {
    public static void main(String[] args){
        int cont = 0;

        System.out.print("\n");

        for(int i = 0; i < 60; i++){
            if(i < 9){
                System.out.print(" 0" + (i + 1));
                cont++;
            } else {
                System.out.print(" " + (i + 1));
                cont++;
            }

            if(cont == 10){
                System.out.print("\n");
                cont = 0;
            }
        }

        System.out.print("\n");
    }
}
