import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

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

        //Cricação da função

        void Tradicional(){

        // Pedra papel tesoura normal

        // Combinações pedra

        if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.player1.jogada.equals("pedra")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("Deu empate");
        }

        // Combinações papel

        if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

        if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("Deu empate");
        }

        if ((this.player1.jogada.equals("papel")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        // Combinações tesoura

        if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("tesoura"))) {
            System.out.println("Deu empate");
        }

        if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("papel"))) {
            System.out.println("O vencedor é " + this.player1.nome);
        }

        if ((this.player1.jogada.equals("tesoura")) && (this.player2.jogada.equals("pedra"))) {
            System.out.println("O vencedor é " + this.player2.nome);
        }

    }
}
}