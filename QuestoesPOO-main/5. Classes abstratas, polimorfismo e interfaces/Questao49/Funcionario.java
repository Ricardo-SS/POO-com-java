public class Funcionario {
    private String nome;
    private int id;
    private String turno;
    private double salarioPorHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.id = 0;                    //Id padrão
        this.turno = "Manhã";           //Turno padrão
        this.salarioPorHora = 5.0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.id = 0;                    //Id padrão
        this.turno = "Manhã";           //Turno padrão
        this.salarioPorHora = salarioPorHora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTurno(String turno) {
        if(turno == "Tarde" || turno == "Noite") this.turno = turno;
    }

    public void reajusteSalario(double salarioPorHora){
        if(salarioPorHora >= 0) this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "\tNome -> " + nome + "\n\tId -> " + id + "\n\tTurno -> " + turno + "\n\tSalario(Hora) -> " + salarioPorHora + "\n";
    };

    
}