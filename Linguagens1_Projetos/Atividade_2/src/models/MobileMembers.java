package models;

import interfaces.PostarMensagem;
import models.Funcionario;

public class MobileMembers extends Funcionario implements PostarMensagem{

   
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