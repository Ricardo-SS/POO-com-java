package PrimeiraUnidade.lista.ArraysEArrayList.q35cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class demoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int id;
        do {
            System.out.print("Digite o ID do cliente (negativo para sair): ");
            id = scanner.nextInt();
            if (id >= 0) {
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.next();
                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o telefone do cliente: ");
                String telefone = scanner.next();

                clientes.add(new Cliente(id, nome, idade, telefone));
            }
        } while (id >= 0);

        System.out.println("\nDados dos clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        scanner.close();
    }
}
