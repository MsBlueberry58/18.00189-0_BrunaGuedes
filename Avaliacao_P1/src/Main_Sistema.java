import dados_pedido.Pedido;
import user.Usuario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main_Sistema {


    public static void main(String[] args) {
        String nome = "Bruna", email = "brunagguedes4@gmail.com";
        int op;
        Usuario u1 = new Usuario(nome, email);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a Pizzaria Rato Que Ri!");

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Nova venda \n2 - Verificar pedidos \n3 - Alterar pedidos\n4 - Sair");
            op = Integer.parseInt(scanner.nextLine());

            switch(op) {

                case 1:
                    String desc, pag, valor, pass;
                    System.out.println("Para a realizacao da autenticacao de usuario, digite sua senha: \n");
                    pass = scanner.nextLine();
                   if (u1.autenticando(pass) == true) {
                       System.out.println("Digite a descriçao do pedido: ");
                       desc = scanner.nextLine();
                       System.out.println("Digite o valor do pedido: ");
                       valor = scanner.nextLine();
                       System.out.println("Digite a forma de pagamento do pedido: ");
                       pag = scanner.nextLine();
                       Pedido p1 = new Pedido(desc, pag.toUpperCase(), valor);
                       pedidos.add(p1);
                       System.out.println("Seu pedido: \n");
                       System.out.println("ID: " + p1.getId() + "\nDescricao: " + p1.getDescricao() + "\nValor: " + p1.getValor() + "\nPagamento: " + p1.getPagamento() + "\nEstado: " + p1.getEstado());
                   }
                   else{
                       System.out.println("Senha invalida, tente novamente.");
                   }
                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:
                    System.out.println("Obrigado e bom dia");

                    break;

            }

        } while (op != 4);

    }

}
