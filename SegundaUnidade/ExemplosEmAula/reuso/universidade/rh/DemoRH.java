package ExemplosEmAula.reuso.universidade.rh;

// esses codigo estao funcionando normalmente, e herado classes entre se.
public class DemoRH {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro", "213456" );
        Funcionario f = new Funcionario("julia", "0215487", 1420.00);
        ChefeDeDepertamento c = new ChefeDeDepertamento("maria", "415545", 2000.00, "RH");

        System.out.println(p);
        System.out.println(f);
        System.out.println(c);
    }
}
