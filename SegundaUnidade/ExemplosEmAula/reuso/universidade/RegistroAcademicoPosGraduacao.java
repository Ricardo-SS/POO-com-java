package ExemplosEmAula.reuso.universidade;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String orientado;

    
    public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientado) {
        this.registro = registro;
        this.tituloTese = tituloTese;
        this.orientado = orientado;
    }


    public String toString() {
        String res = registro.toString();
        res += "Titulo da tese: " + tituloTese + "\n";
        res += "Orientador: " + orientado + "\n";
        return res;
    }
}
