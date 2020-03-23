
public class Jogador{
    private String nome;
    private Jogada jogada;

    public Jogador(String nome, String escolha){
        this.nome = nome;
        jogada = new Jogada(escolha);
    }

}