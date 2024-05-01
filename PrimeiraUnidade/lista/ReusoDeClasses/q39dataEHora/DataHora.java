// 39. Crie uma classe para representar uma data e um horário (DataHora). • Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que contenha um campo para indicar qual o evento que ela representa (use uma String para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao;
// • Escreva uma classe EventoHeranca que seja baseada na classe dataHora e que contenha um campo para indicar qual o evento que ela representa (use uma String para isto). Use o mecanismo de herança para criar a classe EventoHeranca;
// • Escreva um aplicativo de teste que demonstre o uso das classes criadas

package PrimeiraUnidade.lista.ReusoDeClasses.q39dataEHora;

class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    
    public DataHora(int dia, int mes, int ano, int hora, int minuto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto;
    }
}

class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(int dia, int mes, int ano, int hora, int minuto, String evento){
        this.dataHora = new DataHora(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    @Override
    public String toString(){
        return "Evento: " + evento + " - Data e Hora: " + dataHora;
    }
}

// Classe EventoHeranca baseada na classe DataHora usando herança
class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String evento){
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    @Override
    public String toString(){
        return "Evento: " + evento + " - Data e Hora: " + super.toString();
    }
}
