public class Questao17 {
    public static void main(String[] args){
        int cont = 0;
        double cityA = 7000, cityB = 20000;

        while(cityA <= cityB){
            cityA += cityA * 0.035;
            cityB += cityA * 0.01;

            cont++;
        }

        System.out.print("Em " + cont + " anos a cidade A ultrapassará a cidade B no número de população.\n");
    }
}
