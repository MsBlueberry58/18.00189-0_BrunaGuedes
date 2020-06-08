package models;

import interfaces.PostarMensagem;

public abstract class Funcionario implements PostarMensagem{
    String nome, email;

    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    

    
    
}