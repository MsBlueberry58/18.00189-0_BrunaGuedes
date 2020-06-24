package dados_pedido;

import dados_pedido.enums.Estado_Pedido;
import dados_pedido.enums.Forma_Pagamento;

import java.util.ArrayList;
import java.util.Random;

public class Pedido {
    String id;
    Enum estado;
    Enum pagamento;
    String descricao;

    ArrayList<Forma_Pagamento> pagamentos = new ArrayList<>();


    public void Pedido(String descricao, String payment) {
        id = geradorID();
        estado = Estado_Pedido.REALIZADO;
        descricao = this.descricao;
        for (Enum formas : pagamentos) {
            if (payment.equals(formas.toString())) {
                pagamento = formas;
            }
        }
    }


    private String geradorID() {
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++) {
            idGerado += random.nextInt(10);
        }
        return idGerado;
    }


}
