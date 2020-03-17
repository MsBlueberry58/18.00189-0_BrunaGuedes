import java.util.Scanner;

public class Spock {
    public static void main(String[] args) {
        // variáveis
        Scanner scanner = new Scanner (System.in);
        Jogador player1;
        Jogador player2;

        // Coleta de dados

        System.out.println("Insira o nome do primeiro jogador: ");
        this.player1.nome = scanner.nextLine();

        System.out.println("Digite sua jogada: ");
        this.player1.jogada = scanner.nextLine();
        this.player1.jogada = player1.jogada.toLowerCase();

        LimparTela();

        System.out.println("Insira o nome do segundo jogador: ");
        this.player2.nome = scanner.nextLine();

        System.out.println("Digite sua jogada: ");
        this.player2.jogada = scanner.nextLine();
        this.player2.jogada = player2.jogada.toLowerCase();

        LimparTela();

        //Criação da função 
        
        void Spock(){

        // Pedra papel tesoura normal

        // Combinações pedra

        if ((this.jogada1.equals("pedra")) && (this.jogada2.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("pedra")) && (this.jogada2.equals("papel"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("pedra")) && (this.jogada2.equals("pedra"))) {
            System.out.println("Deu empate");
        }

        // Combinações papel

        if ((this.jogada1.equals("papel")) && (this.jogada2.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("papel")) && (this.jogada2.equals("papel"))) {
            System.out.println("Deu empate");
        }

        if ((this.jogada1.equals("papel")) && (this.jogada2.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        // Combinações tesoura

        if ((this.jogada1.equals("tesoura")) && (this.jogada2.equals("tesoura"))) {
            System.out.println("Deu empate");
        }

        if ((this.jogada1.equals("tesoura")) && (this.jogada2.equals("papel"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("tesoura")) && (this.jogada2.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        // Parte do Lizard Spock

        // Combinações Spock

        if ((this.jogada1.equals("spock")) && (this.jogada2.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("spock")) && (this.jogada2.equals("papel"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("spock")) && (this.jogada2.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("spock")) && (this.jogada2.equals("lagarto"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("spock")) && (this.jogada2.equals("spock"))) {
            System.out.println("Deu empate");
        }

        // Combinações lagarto

        if ((this.jogada1.equals("lagarto")) && (this.jogada2.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("lagarto")) && (this.jogada2.equals("papel"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("lagarto")) && (this.jogada2.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("lagarto")) && (this.jogada2.equals("lagarto"))) {
            System.out.println("Deu empate");
        }

        if ((this.jogada1.equals("lagarto")) && (this.jogada2.equals("spock"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        // Combinações pedra

        if ((this.jogada1.equals("pedra")) && (this.jogada2.equals("lagarto"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("pedra")) && (this.jogada2.equals("spock"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        // Combinações papel

        if ((this.jogada1.equals("papel")) && (this.jogada2.equals("lagarto"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.jogada1.equals("papel")) && (this.jogada2.equals("spock"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        // Combinações tesoura

        if ((this.jogada1.equals("tesoura")) && (this.jogada2.equals("lagarto"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.jogada1.equals("tesoura")) && (this.jogada2.equals("spock"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

     }

    }

}