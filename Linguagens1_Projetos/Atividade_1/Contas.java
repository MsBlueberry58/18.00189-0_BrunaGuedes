// Bruna Galastri Guedes
// 18.00189-0

public class Contas {
    private String idConta;
    private static int contador = 0;
    private double saldo;
    private Usuarios user;

    // Construtores
    Contas(Usuarios user, double saldo){
        this.saldo = saldo;
        contador = contador + 1;
        this.idConta = String.valueof(contador);
    }

    public String getId(){
        return idConta;
    }
    public void SaldoFinal(double saldo){

    }

    public double getSaldo(){
        return saldo;
    }
}