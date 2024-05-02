public abstract class FiguraGeometrica {
    private int cordX;
    private int cordY;

    public FiguraGeometrica(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public int getCordX() {
        return cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public abstract void desenha();
}
