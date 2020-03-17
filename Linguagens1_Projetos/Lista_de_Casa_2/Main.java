import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        // Declaração de variáveis

        Scanner scanner = new Scanner (System.in);
        String modo;

        // Coleta de dados

        do{
            System.out.println("Escolha um modo de jogo (Tradicional ou Spock): ");
            modo = scanner.nextLine();
            modo = modo.toLowerCase();

            if(modo.equals("tradicional")){
                PedraPapelTesoura jogoTrad = new PedraPapelTesoura();
                jogoTrad.Tradicional();
                
            }
            else{
                Spock jogoSpock = new Spock();
                jogoSpock.SpockGame();
            }

        }while (!((modo.equals("tradicional")) || (modo.equals("spock"))));
    }
}