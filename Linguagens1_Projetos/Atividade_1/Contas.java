// Bruna Galastri Guedes
// 18.00189-0

public class Contas {
    private String idConta;
    private static int contador = 0;
    private double saldo;
    private Usuarios user;

    // Construtores
    Contas(Usuarios user, double saldoInicial){
        this.user = user;
        this.saldo = saldoInicial;
        contador = contador + 1;
        this.idConta = String.valueOf(contador);
    }

    public String getId(){
        return idConta;
    }

    public Usuarios getUser(){
        return user;
    }

    public void Sacar(double valor){
            this.saldo -= valor; 
    }

    public void Depositar(double valor){
            this.saldo += valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
}