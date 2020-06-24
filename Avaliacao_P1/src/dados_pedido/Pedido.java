package dados_pedido;
import dados_pedido.enums.Estado_Pedido;

import java.util.Random;

public class Pedido {
    String id;
    Enum estado;
    Enum pagamento;

    public void Pedido() {
        id = geradorID();
        estado = Estado_Pedido.REALIZADO;
    }

    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i<3; i++){
            idGerado += random.nextInt(10);
        }
        return idGerado;
    }

}
