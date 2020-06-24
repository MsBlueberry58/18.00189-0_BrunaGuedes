package user;


/**
 * A classe Usuario representa o usuário que está interagindo com a interface do menu; a classe implementa
 * a interface "autenticacao"
 */
public class Usuario implements autenticacao {
    String nome;
    String email;
    /**
     * A senha padrão do usuário é "123456", e a verificação ocorre entre a senha digitada na main pelo usuário
     * e essa senha padrão
     */
    private String senha = "123456";

    /**
     * Construtor da classe
     * @param nome (nome do usuário)
     * @param email (email do usuário)
     */
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /**
     * Método da interface autenticacao, escrita de acordo com a verificação entre as senhas
     * digitada pelo usuário e a senha padrão da classe usuário
     * @param password senha recebida pelo usuário na main
     * @return retorna positivo se as senhas baterem
     */
    @Override
    public boolean autenticando(String password) {
        if (this.senha.equals(password)) {
            return true;
        }
        else
            return false;
    }
}
