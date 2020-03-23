
public class Jogada {
    private String escolha, ganhoDe, percoDe;

    public Jogada(String opcao) {
        if (opcao.equals("pedra")) {
            ganhoDe = "tesoura";
            percoDe = "papel";
        } else if (opcao.equals("papel")) {
            ganhoDe = "pedra";
            percoDe = "tesoura";
        } else {
            ganhoDe = "papel";
            percoDe = "pedra";
        }
        escolha = opcao;

    }

    public String getEscolha() {
        return this.escolha;
    }

    public String avaliar(Jogada jogada) {
        if (jogada.getEscolha().equals(this.ganhoDe)) {
            return "Ganhei!";
        } else if (jogada.getEscolha().equals(this.percoDe)) {
            return "Perdi!";
        } else {
            return "Empate!";
        }

    }
}