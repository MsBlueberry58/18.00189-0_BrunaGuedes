import dados_pedido.Pedido;
import user.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Sistema {

    public static void main(String[] args) {
        String nome = "Bruna", email = "brunagguedes4@gmail.com";
        String pass;
        int op;
        Usuario u1 = new Usuario(nome, email);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a Pizzaria Rato Que Ri!");

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Nova venda \n2 - Verificar pedidos \n3 - Alterar pedidos\n4 - Sair");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {

                case 1:
                    String desc, pag, valor;
                    System.out.println("Para a realizacao da autenticacao de usuario, digite sua senha: \n");
                    pass = scanner.nextLine();
                    if (u1.autenticando(pass)) {
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
                    } else {
                        System.out.println("Senha invalida, tente novamente.");
                    }
                    break;

                case 2:
                    for (Pedido order : pedidos) {
                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());
                    }

                    break;

                case 3:
                    String id_input;
                    int option;
                    System.out.println("Para a realizacao da autenticacao de usuario, digite sua senha: \n");
                    pass = scanner.nextLine();
                    if (u1.autenticando(pass)) {
                        for (Pedido order : pedidos) {
                            System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());
                        }
                        System.out.println("Digite o id do pedido que deseja alterar: \n");
                        id_input = scanner.nextLine();
                        for (Pedido order : pedidos) {
                            if (id_input.equals(order.getId())) {
                                System.out.println("Selecione a categoria que deseja alterar: \n");
                                System.out.println("1 - Descricao \n2 - Valor \n3 - Pagamento \n4 - Estado");
                                option = Integer.parseInt(scanner.nextLine());

                                switch (option){
                                    case 1:
                                        String new_desc;
                                        System.out.println("Digite a nova descricao: \n");
                                        new_desc = scanner.nextLine();
                                        order.setDescricao(new_desc);

                                        break;

                                    case 2:
                                        String new_valor;
                                        System.out.println("Digite o novo valor: \n");
                                        new_valor = scanner.nextLine();
                                        order.setValor(new_valor);
                                        break;

                                    case 3:
                                        String new_pag;
                                        System.out.println("Digite a nova forma de pagamento: \n");
                                        new_pag = scanner.nextLine();


                                        break;

                                    case 4:
                                        String new_state;
                                        System.out.println("Digite o novo estado do pedido: \n");
                                        new_state = scanner.nextLine();

                                        break;

                                }

                            } else {
                                System.out.println("ID invalido, tente novamente.");
                            }
                        }


                    } else {
                        System.out.println("Senha invalida, tente novamente.");
                    }

                    break;

                case 4:
                    System.out.println("Obrigado, bom dia, boa tarde e boa noite");

                    break;

            }

        } while (op != 4);

    }

}
