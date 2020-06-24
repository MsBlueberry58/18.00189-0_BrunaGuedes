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


    public Pedido(String desc, String payment) {
        id = geradorID();
        estado = Estado_Pedido.REALIZADO;
        descricao = desc;
        if (payment.equals("CREDITO")) {
            pagamento = Forma_Pagamento.CREDITO;
        }
        if (payment.equals("DEBITO")) {
            pagamento = Forma_Pagamento.DEBITO;
        }
        if (payment.equals("DINHEIRO")) {
            pagamento = Forma_Pagamento.DINHEIRO;
        }
        if (payment.equals("VALE ALIMENTACAO")) {
            pagamento = Forma_Pagamento.VALE_ALIMENTACAO;
        }
        if (payment.equals("VALE REFEICAO")) {
            pagamento = Forma_Pagamento.VALE_REFEICAO;
        }
    }

    public String getId() {
        return id;
    }

    public Enum getEstado() {
        return estado;
    }

    public Enum getPagamento() {
        return pagamento;
    }

    public String getDescricao() {
        return descricao;
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
