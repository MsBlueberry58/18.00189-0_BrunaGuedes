package models;

import models.Funcionario;


/** Um tipo de funcionário, possui suas próprias mensagens de PostarMensagem, e é filho de Funcionario */

public class BigBrothers extends Funcionario {


      //Construtor  
      public BigBrothers(String nome, String email) {
        super(nome, email);
        
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