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


    public Pedido(String descricao, String payment) {
        id = geradorID();
        estado = Estado_Pedido.REALIZADO;
        descricao = this.descricao;
        if(payment == "CREDITO"){
            pagamento = Forma_Pagamento.CREDITO;
        }
        if(payment == "DEBITO"){
            pagamento = Forma_Pagamento.DEBITO;
        }
        if(payment == "DINHEIRO"){
            pagamento = Forma_Pagamento.DINHEIRO;
        }
        if(payment == "VALE ALIMENTACAO"){
            pagamento = Forma_Pagamento.VALE_ALIMENTACAO;
        }
        if(payment == "VALE REFEICAO"){
            pagamento = Forma_Pagamento.VALE_REFEICAO;
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
