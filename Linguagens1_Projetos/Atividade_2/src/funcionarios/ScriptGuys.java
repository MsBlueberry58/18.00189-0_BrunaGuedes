package funcionarios;

import interfaces.PostarMensagem;
import models.Funcionario;

public class ScriptGuys extends User implements PostarMensagem{


    //Construtor



    @Override
    public void MsgNormal() {
        System.out.println("Prazer em ajudar novos amigos de código!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");

    }
    
}