package funcionarios;

import interfaces.PostarMensagem;
import models.Funcionario;

public class MobileMembers extends Funcionario implements PostarMensagem{

   
    public MobileMembers(String user, String email, String function) {
        super(user, email, function);
        
    }

    @Override
    public void MsgNormal() {
        System.out.println("Happy Coding!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("MAsK_S0c13ty");

    }

   

} 