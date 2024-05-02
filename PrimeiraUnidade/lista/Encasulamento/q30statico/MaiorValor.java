package PrimeiraUnidade.lista.Encasulamento.q30statico;

// 30. Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
// quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
// ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
// objetos, demonstre as capacidades da classe criada

public class MaiorValor {
    public static int maior(int a, int b) {
        return Math.max(a, b);
    }

    public static double maior(double a, double b) {
        return Math.max(a, b);
    }

    public static int maior(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double maior(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int maior(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static double maior(double a, double b, double c, double d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static int maior(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
}

