public class Questao04 {
    public static int doisInt(int num1, int num2){
        return (num1 > num2 ? num1 : num2);
    }

    public static int tresInt(int num1, int num2, int num3){
        return (doisInt(num1, num2) > num3 ? doisInt(num1, num2) : num3);
    }

    public static int quatroInt(int num1, int num2, int num3, int num4){
        return (tresInt(num1, num2, num3) > num4 ? tresInt(num1, num2, num3) : num4);
    }

    public static int cincoInt(int num1, int num2, int num3, int num4, int num5){
        return (quatroInt(num1, num2, num3, num4) > num5 ? quatroInt(num1, num2, num3, num4) : num5);
    }

    public static double doisDouble(double num1, double num2){
        return (num1 > num2 ? num1 : num2);
    }

    public static double tresDouble(double num1, double num2, double num3){
        return (doisDouble(num1, num2) > num3 ? doisDouble(num1, num2) : num3);
    }

    public static double quatroDouble(double num1, double num2, double num3, double num4){
        return (tresDouble(num1, num2, num3) > num4 ? tresDouble(num1, num2, num3) : num4);
    }

    public static double cincoDouble(double num1, double num2, double num3, double num4, double num5){
        return (quatroDouble(num1, num2, num3, num4) > num5 ? quatroDouble(num1, num2, num3, num4) : num5);
    }
}