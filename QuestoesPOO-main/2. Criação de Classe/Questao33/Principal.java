public class Principal {
    public static void main(String[] args) {
        Lampada salaDeEstar = new Lampada(false);

        System.out.println("A luz está " + (salaDeEstar.estaLigada()? " ligada.": " desligada."));
        System.out.println("A luz já foi ligada " + salaDeEstar.numVezesLigado() + " vezes.");
        salaDeEstar.acender();
        System.out.println("A luz está " + (salaDeEstar.estaLigada()? " ligada.": " desligada."));
        salaDeEstar.apagar();
        salaDeEstar.acender();
        salaDeEstar.apagar();
        System.out.println("A luz está " + (salaDeEstar.estaLigada()? " ligada.": " desligada."));
        salaDeEstar.acender();
        System.out.println("A luz está " + (salaDeEstar.estaLigada()? " ligada.": " desligada."));
        System.out.println("A luz já foi ligada " + salaDeEstar.numVezesLigado() + " vezes.");
    }
}
