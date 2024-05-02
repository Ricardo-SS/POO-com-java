import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        String parenteses = "()()()())()";

        if(estaBalaceada(parenteses)){
            System.out.println("Esta balanceada!!");
        } else {
            System.out.println("Nao esta balanceada!!");
        }
    }   
    
    public static boolean estaBalaceada(String parenteses){
        Stack<String> pilha = new Stack<>();

        int size = parenteses.length();
        for(int i = 0; i < size; i++){
            if(parenteses.charAt(i) == ' '){
                continue;
            }

            if(parenteses.charAt(i) == '('){
                pilha.push(parenteses).charAt(i);
            } else if(pilha.isEmpty()){
                return false;
            } else {
                pilha.pop();
            }
        }

        if(pilha.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}