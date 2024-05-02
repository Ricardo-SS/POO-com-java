public class Calendario {
    public static void main(String[] args) {
        indentificaMes(13);
    }
    
    public static void indentificaMes(int numMes){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        try {
            System.out.println(meses[numMes-1]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Este mês não existe!!!");
        }
    }
}
