

public class MinhaClasse {
    private static int contaObjetos = 0;
    private String nome;

    public MinhaClasse (){
        MinhaClasse.contaObjetos = MinhaClasse.contaObjetos + 1;
    
    }

    public static int getContaObjetos() {  
        
        
        //Métodos estáticos só podem acessar propriedades que são do tipo estático da classe, ou variáveis locais dele

        return MinhaClasse.contaObjetos;
    }

}

