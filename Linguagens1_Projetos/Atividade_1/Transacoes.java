// Bruna Galastri Guedes
// 18.00189-0
import java.util.Random;

public class Transacoes {

    // A conta 1 gera um QRCOde, pedindo uma transferência de um certo valor
    public static String GerarQRCode(Contas conta, double valor) {
        return String.format("%s;%s;%s;%s", 
        conta.getId(), conta.getUser().getNome(), 
        String.valueOf(valor), String.valueOf(getRandomNumberInRange(1000, 9999)));
    }

    // Transferir dinheiro da conta 1 para a conta 2
    public static void Transferir(Contas conta1, Contas conta2, String QRCode) {
        String[] dados = QRCode.split(";");
        if (((conta2.getId()).equals(dados[0]))) {
            if ((conta1.getSaldo()) >= (Double.parseDouble(dados[2]))) {
                conta1.Sacar(Double.parseDouble(dados[2]));
                conta2.Depositar(Double.parseDouble(dados[2]));
            } else {
                System.out.println("Saldo de " + conta1.getUser().getNome() + " insuficiente.");
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