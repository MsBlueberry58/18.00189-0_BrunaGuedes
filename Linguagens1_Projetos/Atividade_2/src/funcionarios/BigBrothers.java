package funcionarios;

import interfaces.PostarMensagem;
import models.Funcionario;

public class BigBrothers extends Funcionario implements PostarMensagem{


    //Construtor

       
    public BigBrothers(String user, String email, String function) {
        super(user, email, function);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void MsgNormal() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("...");

    }
    
}