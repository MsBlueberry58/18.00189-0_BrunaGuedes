import dados_pedido.Pedido;
import dados_pedido.enums.Estado_Pedido;
import dados_pedido.enums.Forma_Pagamento;
import user.Usuario;


import java.util.ArrayList;
import java.util.Scanner;

public class Main_Sistema {

    public static void main(String[] args) {

        /**
         * Começando o programa com um usuário previamente cadastrado no sistema, então já atribuindo valores de nome e email,
         * visto que o que importa na verificação do programa é a senha. Criando também o usuário em si
         */
        String nome = "Bruna", email = "brunagguedes4@gmail.com";
        String pass;
        int op;
        Usuario u1 = new Usuario(nome, email);
        /**
         * Criando a lista de pedidos, declarando scanner
         */
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario: " + nome);
        System.out.println("Bem-vindo a Pizzaria Rato Que Ri!");


        do {

            /**
             * Inicializando o menu e apresentando as opções da interface
             */
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Nova venda \n2 - Verificar pedidos \n3 - Alterar pedidos\n4 - Sair \n");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {

                case 1:
                    /**
                     * Declarando as variáveis da descrição, do pagamento e do valor que vão ser digitados pelo usuário
                     */
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
                        pag = pag.replaceAll(" ", "");
                        Pedido p1 = new Pedido(desc, pag.toLowerCase(), valor);
                        if(!(p1.getPagamento() == null)){
                            pedidos.add(p1);
                            System.out.println("Seu pedido: \n");
                            System.out.println("ID: " + p1.getId() + "\nDescricao: " + p1.getDescricao() + "\nValor: " + p1.getValor() + "\nPagamento: " + p1.getPagamento() + "\nEstado: " + p1.getEstado() + "\n");
                        }
                        else{
                            System.out.println("Forma de pagamento invalida, crie outro pedido.");
                        }

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
                    boolean verifier = false;
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
                                verifier = true;
                                System.out.println("Selecione a categoria que deseja alterar: \n");
                                System.out.println("1 - Descricao \n2 - Valor \n3 - Pagamento \n4 - Estado");
                                option = Integer.parseInt(scanner.nextLine());

                                switch (option) {
                                    case 1:
                                        String new_desc;
                                        System.out.println("Digite a nova descricao: \n");
                                        new_desc = scanner.nextLine();
                                        order.setDescricao(new_desc);
                                        System.out.println("Pedido alterado: \n");
                                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());

                                        break;

                                    case 2:
                                        String new_valor;
                                        System.out.println("Digite o novo valor: \n");
                                        new_valor = scanner.nextLine();
                                        order.setValor(new_valor);
                                        System.out.println("Pedido alterado: \n");
                                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());


                                        break;

                                    case 3:
                                        int new_pag;
                                        System.out.println("Digite a nova forma de pagamento: \n");
                                        System.out.println("1 - Credito \n2 - Debito \n3 - Dinheiro \n4 - Vale alimentacao \n5 - Vale refeicao \n");
                                        new_pag = Integer.parseInt(scanner.nextLine());

                                        switch (new_pag) {
                                            case 1:
                                                order.setPagamento(Forma_Pagamento.CREDITO);
                                                break;

                                            case 2:
                                                order.setPagamento(Forma_Pagamento.DEBITO);
                                                break;

                                            case 3:
                                                order.setPagamento(Forma_Pagamento.DINHEIRO);
                                                break;

                                            case 4:
                                                order.setPagamento(Forma_Pagamento.VALE_ALIMENTACAO);
                                                break;

                                            case 5:
                                                order.setPagamento(Forma_Pagamento.VALE_REFEICAO);
                                                break;
                                        }

                                        System.out.println("Pedido alterado: \n");
                                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());

                                        break;

                                    case 4:
                                        int new_state;
                                        System.out.println("Digite o novo estado do pedido: \n");
                                        System.out.println("1 - Realizado \n2 - Preparacao \n3 - Saiu para a entrega \n4 - Entregue \n5 - Devolvido \n");
                                        new_state = Integer.parseInt(scanner.nextLine());

                                        switch (new_state) {
                                            case 1:
                                                order.setEstado(Estado_Pedido.REALIZADO);
                                                break;

                                            case 2:
                                                order.setEstado(Estado_Pedido.PREPARACAO);
                                                break;

                                            case 3:
                                                order.setEstado(Estado_Pedido.SAIU_PARA_ENTREGA);
                                                break;

                                            case 4:
                                                order.setEstado(Estado_Pedido.ENTREGUE);
                                                break;

                                            case 5:
                                                order.setEstado(Estado_Pedido.DEVOLVIDO);
                                                break;

                                        }

                                        System.out.println("Pedido alterado: \n");
                                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());
                                        break;

                                }

                            break;
                            }

                        }
                        if (!verifier){
                            System.out.println("ID invalido, tente novamente.");
                        }

                    }


                    else {
                        System.out.println("Senha invalida, tente novamente.");
                    }

                    break;

                case 4:
                    System.out.println("Mais um otimo dia de trabalho! Desligando o sistema...");

                    break;

            }

        } while (op != 4);

    }

}
