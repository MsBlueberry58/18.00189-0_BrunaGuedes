//Lista de exercícios
//3. Construa um programa que pede para o usuário informar usuário e senha.
//Depois seu programa deve continuar sendo executado até que o usuário
//informe usuário e senha corretamente.

import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha, usu2, sen2;

        System.out.println("Informe seu usuario: ");
        usuario = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        senha = scanner.nextLine();

        System.out.println("Digite seu usuario: ");
        usu2 = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        sen2 = scanner.nextLine();

        if ((!usu2.equals(usuario)) || (!sen2.equals(senha))) {
            do {
                System.out.println("Senha ou usuário incorretos. Tente novamente.");
                System.out.println("Digite seu usuario: ");
                usu2 = scanner.nextLine();
                System.out.println("Digite sua senha: ");
                sen2 = scanner.nextLine();
            } while ((!usu2.equals(usuario)) || (!sen2.equals(senha)));
        }
    }
}