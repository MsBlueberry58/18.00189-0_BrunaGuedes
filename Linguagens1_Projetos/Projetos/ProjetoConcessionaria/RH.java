public class RH {
    public static void rodarRH(){
        Gerente g1, g2;
        Vendedor v1, v2;
        double totalDeVendas = 1000;
        g1 = new Gerente(1000);
        v1 = new Vendedor(1000, g1);
        exibirSalarioFinal(totalDeVendas, g1);
        exibirSalarioFinal(totalDeVendas, v1);
        if(g1.darAumento(v1, 0.1))
            System.out.println("Aumento Deu Certo!");
        System.out.println("Vendedor 1:" + v1.getSalarioFinal(totalDeVendas));
    }

    public static void exibirSalarioFinal(double totalDeVendas, Funcionario funcionario){
        System.out.println("Salario final:" + funcionario.getSalarioFinal(totalDeVendas));
    }
}