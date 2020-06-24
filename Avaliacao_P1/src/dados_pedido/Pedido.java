package dados_pedido;

import dados_pedido.enums.Estado_Pedido;
import dados_pedido.enums.Forma_Pagamento;

import java.util.Random;

public class Pedido {
    String id;
    Enum estado;
    Enum pagamento;
    String descricao;
    String valor;


    public Pedido(String desc, String payment, String value) {
        id = geradorID();
        valor = value;
        estado = Estado_Pedido.REALIZADO;
        descricao = desc;
        if (payment.equals("credito")) {
            pagamento = Forma_Pagamento.CREDITO;
        }
        if (payment.equals("debito")) {
            pagamento = Forma_Pagamento.DEBITO;
        }
        if (payment.equals("dinheiro")) {
            pagamento = Forma_Pagamento.DINHEIRO;
        }
        if (payment.equals("valealimentacao")) {
            pagamento = Forma_Pagamento.VALE_ALIMENTACAO;
        }
        if (payment.equals("valerefeicao")) {
            pagamento = Forma_Pagamento.VALE_REFEICAO;
        }
    }

    public String getId() {
        return id;
    }

    public Enum getEstado() {
        return estado;
    }

    public String getValor() {
        return valor;
    }

    public Enum getPagamento() {
        return pagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public void setPagamento(Enum pagamento) {
        this.pagamento = pagamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
