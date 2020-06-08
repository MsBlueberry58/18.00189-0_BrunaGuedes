package funcionarios;

import interfaces.PostarMensagem;
import models.Funcionario;

public class MobileMembers extends Funcionario implements PostarMensagem{

   
    @Override
    public void MsgNormal() {
        System.out.println("");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("");

    }

} 