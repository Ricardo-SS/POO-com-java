public class Times{
    private String nome;
    private int vit;
    private int emp;
    private int der;
    private int pontos;
    private int gols;
    private int golsSofrido;
    private int saldoGols;
    
    public Times(String nome, int vit, int emp, int der, int gols, int golsSofrido){
        this.nome = nome;
        this.vit = vit;
        this.emp = emp;
        this.der = der;
        this.gols = gols;
        this.golsSofrido = golsSofrido;
        this.pontos = calcularPontos(vit, der, emp);
        this.saldoGols = saldoDeGol(gols, golsSofrido);
    }

    private int calcularPontos(int vitorias, int derrotas, int empates) {
        return ((vitorias * 3) + empates - (derrotas * 3)); 
    }

    private int saldoDeGol(int gols, int golsSofrido){
        return (gols - golsSofrido);
    }

    public String getNome() {
        return (nome + " Futebol Clube");
    }

    public String getPontos() {
        return nome + " tem " + pontos + " pontos.";
    }

    public String getSaldoGols() {
        return nome + " está com saldo de gol de " + saldoGols + ".";
    }

    public void setVit(int vit) {
        this.vit = vit;
        calcularPontos(vit, der, emp);
    }

    public void setEmp(int emp) {
        this.emp = emp;
        calcularPontos(vit, der, emp);
    }

    public void setDer(int der) {
        this.der = der;
        calcularPontos(vit, der, emp);
    }
}