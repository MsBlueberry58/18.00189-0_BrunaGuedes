package models;

import interfaces.PostarMensagem;
import models.Funcionario;

public class ScriptGuys extends Funcionario implements PostarMensagem{


      //Construtor  
      public ScriptGuys(String nome, String email) {
        super(nome, email);
        
    }




    @Override
    public void MsgNormal() {
        System.out.println("Prazer em ajudar novos amigos de código!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");

    }
    
}