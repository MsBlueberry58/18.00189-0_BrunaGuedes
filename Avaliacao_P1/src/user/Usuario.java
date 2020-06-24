package user;

public class Usuario implements autenticacao {
    String nome;
    String email;
    private String senha = "123456";

    public String getSenha() {
        return senha;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean autenticando(String password) {
        if (this.senha.equals(password)) {
            return true;
        }
        else
            return false;
    }
}
