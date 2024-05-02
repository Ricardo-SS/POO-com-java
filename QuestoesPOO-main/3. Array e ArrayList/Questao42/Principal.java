public class Principal {
    public static void main(String[] args) {
        int d1, d2, soma;
        int[] quantidade = new int[11];

        for(int i = 0; i < 36000000; i++){
            d1 = DadoDeSeis.rodar();
            d2 = DadoDeSeis.rodar();
            soma = d1 + d2;
        
            switch (soma){
                case 2:
                    quantidade[0]++; 
                    break;
                case 3:
                    quantidade[1]++; 
                    break;
                case 4:
                    quantidade[2]++; 
                    break;
                case 5:
                    quantidade[3]++; 
                    break;
                case 6:
                    quantidade[4]++; 
                    break;
                case 7:
                    quantidade[5]++; 
                    break;
                case 8:
                    quantidade[6]++; 
                    break;
                case 9:
                    quantidade[7]++; 
                    break;
                case 10:
                    quantidade[8]++; 
                    break;
                case 11:
                    quantidade[9]++; 
                    break;
                case 12:
                    quantidade[10]++; 
                    break;
            }
        }
        
        for(int i = 0; i < 11; i++){
            System.out.print("A soma "+ (i+2) + " apareceu " + quantidade[i] + " vezes.\n");
        }
    }   
}
