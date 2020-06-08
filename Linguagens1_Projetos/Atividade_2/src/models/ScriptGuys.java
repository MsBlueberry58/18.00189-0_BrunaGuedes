package models;

import models.Funcionario;


/** Um tipo de funcionário, possui suas próprias mensagens de PostarMensagem, e é filho de Funcionario */

public class ScriptGuys extends Funcionario {


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