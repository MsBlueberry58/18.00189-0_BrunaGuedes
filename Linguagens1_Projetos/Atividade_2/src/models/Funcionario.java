package models;

import interfaces.PostarMensagem;

/** Classe abstrata, criação da base para as outras classes de funcionários */

public abstract class Funcionario implements PostarMensagem{
    String nome, email;

   
    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
 

    public String getEmail() {
        return email;
    }

  

    

    
    
}