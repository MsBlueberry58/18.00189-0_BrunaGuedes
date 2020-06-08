package funcionarios;

import interfaces.PostarMensagem;
import models.Funcionario;

public class BigBrothers extends User implements PostarMensagem{


    //Construtor


    @Override
    public void MsgNormal() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("...");

    }
    
}