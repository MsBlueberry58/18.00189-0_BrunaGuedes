

    public class ContaTestDrive{
        public static void main(String[] args) {
            // Declara c1, ainda sem nada dentro (nullPointer)
            Conta c1;
            // Instância Conta - coloca a referência de um objeto
            c1 = new Conta ();
            //Acessa o titular da conta
            c1.titular = "Odair";
            System.out.println("Titular: " + c1.titular);
        }
    }