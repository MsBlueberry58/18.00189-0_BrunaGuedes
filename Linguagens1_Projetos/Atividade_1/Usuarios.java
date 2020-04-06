// Bruna Galastri Guedes
// 18.00189-0

public class Usuarios {
    private String nome, senha, email;

    // Construtores
    Usuarios(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
}