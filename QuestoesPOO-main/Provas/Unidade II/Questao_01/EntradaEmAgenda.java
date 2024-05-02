public class EntradaEmAgenda{
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int d, int m, int a){
        return (dia == d && mes == m && ano == a) ? true : false;
    }

    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto="
                + assunto + "]";
    }

    

    
}