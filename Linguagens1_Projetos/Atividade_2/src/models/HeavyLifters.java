package models;

import models.Funcionario;

/** Um tipo de funcionário, possui suas próprias mensagens de PostarMensagem, e é filho de Funcionario */

public class HeavyLifters extends Funcionario {


    //Construtor  
    public HeavyLifters(String nome, String email) {
        super(nome, email);
        
    }

    @Override
    public void MsgNormal() {
        System.out.println("Podem contar conosco!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");

    }

  
}