import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Cliente> listaClientes = new ArrayList<>();
        
        int id, idade;
        String nome, telefone;

        System.out.print("Digite o ID - ");
        id = input.nextInt();

        do {
            System.out.print("Digite o nome - ");
            nome = input.next();

            System.out.print("Digite a idade - ");
            idade = input.nextInt();

            System.out.print("Digite o telefone - ");
            telefone = input.next();
            
            Cliente pessoa = new Cliente(id, nome, idade, telefone);
            listaClientes.add(pessoa);

            System.out.print("\n\nDigite o ID - ");
            id = input.nextInt();

        } while (id != -1); 
        
        for(int i = 0; i < listaClientes.size(); i++){
            System.out.println("\n" + listaClientes.get(i));
        }
    }    
}
