import java.util.Scanner;

public class Spock {
    
        // Declaração de variáveis
        Scanner scanner = new Scanner (System.in);
        Jogador player1;
        Jogador player2;
        LimparTela limpar = new LimparTela();

        //Criação da função 
        
        void SpockGame() {

        // Criação dos jogadores

        player1 = new Jogador();
        player2 = new Jogador();

         // Coleta de dados

         System.out.println("Insira o nome do primeiro jogador: ");
         this.player1.nome = scanner.nextLine();
 
         System.out.println("Digite sua jogada: ");
         this.player1.jogada = scanner.nextLine();
         this.player1.jogada = player1.jogada.toLowerCase();
 
         limpar.Limpeza();

         System.out.println("Insira o nome do segundo jogador: ");
         this.player2.nome = scanner.nextLine();
 
         System.out.println("Digite sua jogada: ");
         this.player2.jogada = scanner.nextLine();
         this.player2.jogada = player2.jogada.toLowerCase();

        limpar.Limpeza();

 
        // Pedra papel tesoura normal

        // Combinações pedra

        if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("Deu empate");
        }

        // Combinações papel

        else if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("Deu empate");
        }

        else if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        // Combinações tesoura

        else if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("Deu empate");
        }

        else if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        // Parte do Lizard Spock

        // Combinações Spock

        else if ((this.player1.jogada.equals("spock")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("spock")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("spock")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("spock")) && (this.player2.jogada.equals("lagarto"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("spock")) && (this.player2.jogada.equals("spock"))) {
            System.out.println("Deu empate");
        }

        // Combinações lagarto

        else if ((this.player1.jogada.equals("lagarto")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("lagarto")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("lagarto")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("lagarto")) && (this.player2.jogada.equals("lagarto"))) {
            System.out.println("Deu empate");
        }

        else if ((this.player1.jogada.equals("lagarto")) && (this.player2.jogada.equals("spock"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        // Combinações pedra

        else if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("lagarto"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("spock"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        // Combinações papel

        else if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("lagarto"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

        else if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("spock"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        // Combinações tesoura

        else if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("lagarto"))) {
            System.out.println("O vencedor eh " + this.player1.nome);
        }

        else if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("spock"))) {
            System.out.println("O vencedor eh " + this.player2.nome);
        }

     }

    }

