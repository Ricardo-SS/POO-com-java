import java.util.Stack;

public class Pilha{
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String string = " ((()g)";
        char[] caracter = string.toCharArray();
        int dir = 0;
        int esq = 0;

        for (char c : caracter) {
            if(c != '(' && c != ')'){
                continue;
            } 

            if(c == '('){
                dir++;
                pilha.push(c);
            } else if(c == ')'){
                esq++;
                pilha.push(c);
            }
        }

        if(dir == esq){
            System.out.println("Está balanceada");
        } else{
            System.out.println("Não está balanceada");
        }

        
    }
}