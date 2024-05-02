public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }
        
        if(dia > 0 && dia < 31){
            this.dia = dia;
        }
        
        if(mes > 0 && mes < 13){
            this.mes = mes;
        }
        
        if(ano > 0){
            this.ano = ano;
        }
        
        if(!assunto.isEmpty()){
            this.assunto = assunto;
        } 
        
    }

    public boolean ehNoDia(int d, int m, int a){
        return (d == dia && m == mes && a == ano) ? true : false;
    }

    public String toString(){
        return ("Lembrete: " + assunto + "\n" + dia + "/" + mes + "/" + ano + " as " + hora + " horas.");
    } 
}
