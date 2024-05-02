public class Desenho {
    private FiguraGeometrica fig1;
    private FiguraGeometrica fig2;

    public Desenho(FiguraGeometrica fig1, FiguraGeometrica fig2) {
        this.fig1 = fig1;
        this.fig2 = fig2;
    }

    public void apresenta(){
        System.out.printf("Desenhando uma figura na cordenada (%d, %d).", this.fig1.getCordX(), this.fig1.getCordY());
        fig1.desenha(); 

        System.out.printf("Desenhando uma figura na cordenada (%d, %d).", this.fig2.getCordX(), this.fig2.getCordY());
        fig2.desenha(); 
    }
}
