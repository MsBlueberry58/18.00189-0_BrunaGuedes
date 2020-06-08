package models;

import models.Funcionario;

/** Um tipo de funcionário, possui suas próprias mensagens de PostarMensagem, e é filho de Funcionario */

public class MobileMembers extends Funcionario {

   
      //Construtor  
      public MobileMembers(String nome, String email) {
        super(nome, email);
        
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