
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, genero, descricao;
        System.out.println("Informe nome, genero e descricao: ");
        nome = scanner.nextLine();
        genero = scanner.nextLine();
        descricao = scanner.nextLine();

        Jogo j1 = new Jogo(nome, genero, descricao);
        System.out.println("J1: " + j1.getInfo());

        System.out.println("Informe nick: ");
        String nick;
        nick = scanner.nextLine();
        Usuario usurario = new Usuario(nick, "123", "");
        Conta conta = new Conta(usurario);
        System.out.println("Dados da conta: " + conta.getInfo());
        conta.addCreditos(50.00);
        for(int i = 0; i<5; i++)
            conta.addJogo(j1);
        System.out.println("Dados da conta: " + conta.getInfo());

    
    }
}