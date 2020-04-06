// Bruna Galastri Guedes
// 18.00189-0

public class Transacoes {
    Contas conta1, conta2;
    int numero;
    String QRCode;
    String[] dados = QRCode.split(";");

    public static void Transferir(Contas conta1, Contas conta2) {
    
        
    }

    public static void Receber(Contas conta1, Contas conta2) {

    }

    // Gerador de número aleatório entre 1000 e 9999
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}