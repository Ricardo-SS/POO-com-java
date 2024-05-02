public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int min;

    public DataHora(int dia, int mes, int ano, int hora, int min) {
        if(dia > 0 && dia < 31) this.dia = dia;
        if(mes > 0 && mes < 13) this.mes = mes;
        if(ano > 0) this.ano = ano;
        if(hora >= 0 && hora < 24) this.hora = hora;
        if(min >= 0 && min <= 60) this.min = min;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }
    
    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno() + " as " + getHora() + ":" + getMin() + "\n";
    }
}
