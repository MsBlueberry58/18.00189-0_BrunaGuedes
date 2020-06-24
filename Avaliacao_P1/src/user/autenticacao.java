package user;

/**
 * Essa interface é um contrato assinado por aqueles que podem ser autenticados pelo sistema principal
 */
public interface autenticacao {

     /**
      * Método que retorna um valor booleano de acordo com a verificação entre as senhas padrão e
      * digitada pelo usuário
      * @param senha digitada pelo usuário na main
      * @return verdadeiro se as senhas baterem
      */
     boolean autenticando (String senha);
}
