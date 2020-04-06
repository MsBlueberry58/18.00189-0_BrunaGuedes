// Bruna Galastri Guedes
// 18.00189-0

import java.util.Scanner;

public class MainAtiv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome1, nome2, nome3; 
        String senha1, senha2, senha3; 
        String email1, email2, email3;
    
        // Criação do usuário 1
        System.out.println("Digite o nome do primeiro usuario: ");
        nome1 = scanner.nextLine();
        System.out.println("Digite a senha do primeiro usuario: ");
        senha1 = scanner.nextLine();
        System.out.println("Digite o email do primeiro usuario: ");
        email1 = scanner.nextLine();
        Usuarios user1 = new Usuarios(nome1,senha1,email1);
    
        // Criação do usuário 2
        System.out.println("Digite o nome do segundo usuario: ");
        nome2 = scanner.nextLine();
        System.out.println("Digite a senha do segundo usuario: ");
        senha2 = scanner.nextLine();
        System.out.println("Digite o email do segundo usuario: ");
        email2 = scanner.nextLine();
        Usuarios user2 = new Usuarios(nome2,senha2,email2);

        // Criação do usuário 3
        System.out.println("Digite o nome do terceiro usuario: ");
        nome3 = scanner.nextLine();
        System.out.println("Digite a senha do terceiro usuario: ");
        senha3 = scanner.nextLine();
        System.out.println("Digite o email do terceiro usuario: ");
        email3 = scanner.nextLine();
        Usuarios user3 = new Usuarios(nome3,senha3,email3);

        // Criação das contas
        Contas c1 = new Contas(user1, 1000);
        Contas c2 = new Contas(user2, 250);
        Contas c3 = new Contas(user3, 3000);

        // Transações
    

        
        // Imprimindo estados inicial e final
        System.out.println("Estado inicial: ");
        System.out.println("\nUsuario: " + user1.getNome() + " --->" + " Saldo: " + c1.getSaldo());
        System.out.println("\nUsuario: " + user2.getNome() + " --->" + " Saldo: " + c2.getSaldo());
        System.out.println("\nUsuario: " + user3.getNome() + " --->" + " Saldo: " + c3.getSaldo());
        System.out.println("\nEstado final: ");
        System.out.println("\nUsuario: " + user1.getNome() + " --->" + " Saldo: " + c1.getSaldo());
        System.out.println("\nUsuario: " + user2.getNome() + " --->" + " Saldo: " + c2.getSaldo());
        System.out.println("\nUsuario: " + user3.getNome() + " --->" + " Saldo: " + c3.getSaldo());

    }
}