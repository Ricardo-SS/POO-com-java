// Crie uma classe EventoAcademico com os atributos nomeDoEvento, localDoEvento e numeroDeParticipantes
// A classe também deve conter um método construtor e o método mostraEvento

package SegundaUnidade.ExemplosEmAula;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento() {
        System.out.println("Evento: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }

    public static void main(String[] args) {
        EventoAcademico meuEvento = new EventoAcademico("Seminário de Ciência da Computação",
                "Universidade XYZ", 50);
        meuEvento.mostraEvento();
    }
}

