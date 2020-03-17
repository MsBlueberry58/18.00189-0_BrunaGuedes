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

    }
}
}