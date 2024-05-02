public class Questao15 {
    public static void main(String[] args){
        int rest, cont = 1, objective = 0;

        while(objective != 4){
            rest = 0;

            for(int i = cont-1; i > 0; i--){
                if(cont % i == 0){
                    rest += i;
                }
            }

            if(rest == cont){
                System.out.print(" " + cont);
                objective++;
            }

            cont++;
        }
    }
}
