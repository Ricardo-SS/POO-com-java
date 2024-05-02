public class Generica <X>{
    private X atrib1;
    private X atrib2;
    private X atrib3;

    public Generica(X atrib1, X atrib2, X atrib3) {
        this.atrib1 = atrib1;
        this.atrib2 = atrib2;
        this.atrib3 = atrib3;
    }

    public int quantSaoIguais(){
        if(atrib1 == atrib2){
            if(atrib1 == atrib3){
                return 3;                   //entrada(5, 5, 5)
            }
            return 2;                       //entrada(5, 5, 3)
        } else if(atrib1 == atrib3){
            return 2;                       //entrada(5, 3, 5)
        } else if(atrib2 == atrib3){
            return 2;                       //entrada(3, 5, 5)
        }

        return 0;
    }

    private X getAtrib1() {
        return atrib1;
    }

    private X getAtrib2() {
        return atrib2;
    }

    private X getAtrib3() {
        return atrib3;
    }

    public String toString() {
        return String.format("Os atributos informados foram " + getAtrib1() + ", " + getAtrib2() + " e " + getAtrib3());
    }
}
