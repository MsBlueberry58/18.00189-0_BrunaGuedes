

public class Personagem {
    // Um site irá acessar as imagens de um personagem
    public static final String URL_PERSONAGEM = "www.pokeapi.com/api/v1/";
    // Agora pode consultar o url a qualquer momento
    private String nomePersonagem;

    public Personagem (String url_personagem) {

        this.nomePersonagem = url_personagem;
    }

    public String getUrl() {

        return URL_PERSONAGEM + this.nomePersonagem;
    }


}