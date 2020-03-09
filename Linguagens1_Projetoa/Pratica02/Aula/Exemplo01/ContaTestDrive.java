

    public class ContaTestDrive{
        public static void main(String[] args) {
            // Declara c1, ainda sem nada dentro (nullPointer)
            Conta c1;
            // Instância Conta - coloca a referência de um objeto
            c1 = new Conta();
            //Acessa o titular da conta
            c1.titular = "Odair";
            System.out.println("Titular: " + c1.titular);
            Conta c2 = new Conta();
            c2.titular = "Goku";
            System.out.println("Titula C2: " + c2.titular);
            c1.saldo = 2000;
            c1.visualizarSaldo();
            c2.visualizarSaldo();
            c1.sacar(300);
            c1.visualizarSaldo();
            c1.sacar(3000);
            c1.visualizarSaldo();
            c1.transferirDinheiro(1000, c2);
            c1.visualizarSaldo();
            c2.visualizarSaldo();
        
            
            
        }
    }