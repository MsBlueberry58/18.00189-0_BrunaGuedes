package models;

import interfaces.PostarMensagem;
import models.Funcionario;

public class HeavyLifters extends Funcionario implements PostarMensagem {


    //Construtor  
    


    @Override
    public void MsgNormal() {
        System.out.println("Podem contar conosco!");

    }
    

    @Override
    public void MsgExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");

    }
    
}