public class OhMaior {
    public static int maiorEntreDois(int num1, int num2){
        return (num1 > num2) ? num1 : num2;
    }

    public static double maiorEntreDois(double num1, double num2){
        return (num1 > num2) ? num1 : num2;
    }

    public static int maiorEntreTres(int num1, int num2, int num3){
        int aux;
        aux = maiorEntreDois(num1, num2);

        return (aux > num3) ? aux : num3;
    }

    public static double maiorEntreTres(double num1, double num2, double num3){
        double aux;
        aux = maiorEntreDois(num1, num2);

        return (aux > num3) ? aux : num3;
    }

    public static int maiorEntreQuatro(int num1, int num2, int num3, int num4){
        int aux;
        aux = maiorEntreTres(num1, num2, num3);
        
        return (aux > num4) ? aux : num4;
    }

    public static double maiorEntreQuatro(double num1, double num2, double num3, double num4){
        double aux;
        aux = maiorEntreTres(num1, num2, num3);
        
        return (aux > num4) ? aux : num4;
    }

    public static int maiorEntreCinco(int num1, int num2, int num3, int num4, int num5){
        int aux;
        aux = maiorEntreQuatro(num1, num2, num3, num4);
        
        return (aux > num5) ? aux : num5;
    }

    public static double maiorEntreCinco(double num1, double num2, double num3, double num4, double num5){
        double aux;
        aux = maiorEntreQuatro(num1, num2, num3, num4);
        
        return (aux > num5) ? aux : num5;
    }
}
