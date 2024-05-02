public class Questao20 {
    public static void main(String[] args) {
        System.out.print(mdc(20,24));
    }

    public static int mdc(int num1, int num2){
        if(num2 > num1){
            return mdc(num2, num1);
        } else if(num2 == 0){
            return num1;
        }

        return mdc(num2, (num1 % num2));
    }
}

