// Bruna Galastri Guedes
// 18.00189-0
import java.util.Random;

public class Transacoes {
    private static Contas conta, conta1, conta2;
    private static int numero;
    private static double valor;
    private static String QRCode;

    public static String GerarQRCode(Contas conta1, double valor) {
        return String.format("{%s;%s;%s;%s}", 
        conta1.getId(), conta1.getUser().getNome(), 
        String.valueOf(valor), String.valueOf(getRandomNumberInRange(1000, 9999)));
    }

    public static void Transferir(Contas conta1, Contas conta2, String QRCode) {
        String[] dados = QRCode.split(";");
        double saldo1Novo, saldo2Novo;
        if ((conta1.getId().equals(dados[0]))) {
            if ((conta1.getSaldo()) >= (Integer.parseInt(dados[2]))) {
                saldo1Novo = conta1.getSaldo() + Integer.parseInt(dados[2]);
                saldo2Novo = conta2.getSaldo() + Integer.parseInt(dados[2]);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("As contas de origem e digitada nao batem.");
        }

    }

    // Gerador de número aleatório, deve ser entre 1000 e 9999
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}