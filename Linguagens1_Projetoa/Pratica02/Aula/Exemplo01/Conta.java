import jdk.nashorn.internal.codegen.types.BooleanType;

public class Conta{
    // Atributos da classe
    public int numero;
    public String titular;
    public double saldo;
    public String CPF;

    // Métodos da classe
    boolean sacar (double valor){
        if (valor>this.saldo)
            return false;
        else{
            this.saldo -= valor;
            return true;
        }
    } 
    void depositar (double valor){
        this.saldo += valor;

    } 
    void visualizarSaldo (){
        System.out.println("Saldo: " + this.saldo);

    }
    boolean transferirDinheiro (double valor, Conta destino){
        if(sacar(valor)){
             // não pode isso pois mexe diretamente no valor do saldo, algo q quem faz é o depositar: destino.saldo += valor;     
            destino.depositar(valor);
            return true;
        }
        else
            return false;
        

    }
 


}