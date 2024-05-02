import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        String paren = "(( ())()) )";

        if(verificBalanceada(paren)){
            System.out.println("Está balanceada!!!");
        } else {
            System.out.println("Não está balanceada!!!");
        }
    }

    public static boolean verificBalanceada(String paren){
        Stack<Character> parenteses = new Stack<>();

        int size = paren.length();
        for(int i = 0; i < size; i++){
            if(paren.charAt(i) == ' '){
                continue;
            }

            if(paren.charAt(i) == '('){
                parenteses.push(paren.charAt(i));

            } else if(parenteses.isEmpty()){
                return false;

            } else {
                parenteses.pop();
            }
        }

        return true;
    }
}
