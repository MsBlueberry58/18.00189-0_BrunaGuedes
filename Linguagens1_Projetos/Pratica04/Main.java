

public class Main {
    public static void main(String[] args) {

        System.out.println("Total objetos: " + MinhaClasse.getContaObjetos());

        MinhaClasse m1 = new MinhaClasse();
        MinhaClasse m2 = new MinhaClasse();
        MinhaClasse m3 = new MinhaClasse();

        System.out.println("Total objetos: " + MinhaClasse.getContaObjetos());

    }
}