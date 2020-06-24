// Bruna Galastri Guedes - 18.00189-0


// Importando os pacotes

import dados_pedido.Pedido;
import dados_pedido.enums.Estado_Pedido;
import dados_pedido.enums.Forma_Pagamento;
import user.Usuario;


import java.util.ArrayList;
import java.util.Scanner;

public class Main_Sistema {

    public static void main(String[] args) {


        //Começando o programa com um usuário previamente cadastrado no sistema, então já atribuindo valores de nome e email,
        //visto que o que importa na verificação do programa é a senha. Criando também o usuário em si

        String nome = "Bruna", email = "brunagguedes4@gmail.com";
        String pass;
        int op;
        Usuario u1 = new Usuario(nome, email);

        /*
         * Criação da lista de pedidos
         */
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario: " + nome);
        System.out.println("Bem-vindo a Pizzaria Rato Que Ri!");

        /*
         * Laço que faz com que o menu continue a aparecer para o usuário, desde que a opção selecionada não
         * seja a de "Sair" (4)
         */
        do {

            // Printando o menu e pegando a opção escolhida pelo usuário
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Nova venda \n2 - Verificar pedidos \n3 - Alterar pedidos\n4 - Sair \n");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {

                /*
                 * "Case" para a criação de um novo pedido; é necessária a senha para autenticar o usuário. Depois
                 * de criar o pedido, adicionar na lista de pedidos e printar o pedido realizado.
                 */
                case 1:
                    String desc, pag, valor;
                    System.out.println("Para a realizacao da autenticacao de usuario, digite sua senha: \n");
                    pass = scanner.nextLine();

                    // Uso da interface autenticação assinada pelo usuário; verificação de senha
                    if (u1.autenticando(pass)) {
                        System.out.println("Digite a descriçao do pedido: ");
                        desc = scanner.nextLine();
                        System.out.println("Digite o valor do pedido: ");
                        valor = scanner.nextLine();
                        System.out.println("Digite a forma de pagamento do pedido: ");
                        pag = scanner.nextLine();

                        // Tirando os espaços do pag  para facilitar a comparação
                        pag = pag.replaceAll(" ", "");

                        // Passando o pag como letras minúsculas para facilitar a comparação
                        Pedido p1 = new Pedido(desc, pag.toLowerCase(), valor);
                        if (!(p1.getPagamento() == null)) {
                            pedidos.add(p1);
                            System.out.println("Seu pedido: \n");
                            System.out.println("ID: " + p1.getId() + "\nDescricao: " + p1.getDescricao() + "\nValor: " + p1.getValor() + "\nPagamento: " + p1.getPagamento() + "\nEstado: " + p1.getEstado() + "\n");
                        } else {
                            System.out.println("Forma de pagamento invalida, crie outro pedido.");
                        }

                    } else {
                        System.out.println("Senha invalida, tente novamente.");
                    }
                    break;

                /*
                 * "Case" para printar a lista de pedidos; não é necessária a senha para autenticar o usuário
                 */
                case 2:
                    for (Pedido order : pedidos) {
                        System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());
                    }

                    break;

                /*
                 * "Case" para a alteração de um pedido; é necessária a senha para autenticar o usuário. A seleção
                 * do pedido ocorre pelo ID (laço "for" de verificação), e se o ID's baterem, entra num "switch-case"
                 * para as opções de alteração
                 */
                case 3:
                    String id_input;
                    int option;
                    /*
                     * Variável booleana usada para a verificação do ID; quando o ID digitado é encontrado na lista
                     * de pedidos, "verifier" assume o valor "true"; se não for encontrado, ele permanece "false" e
                     * é printada a mensagem de erro de ID
                     */
                    boolean verifier = false;
                    System.out.println("Para a realizacao da autenticacao de usuario, digite sua senha: \n");
                    pass = scanner.nextLine();

                    // Uso da interface autenticação assinada pelo usuário; verificação de senha
                    if (u1.autenticando(pass)) {

                        // Printando a lista para melhor visualização dos ID's
                        for (Pedido order : pedidos) {
                            System.out.println("ID: " + order.getId() + "\tDescricao: " + order.getDescricao() + "\tValor: " + order.getValor() + "\tPagamento: " + order.getPagamento() + "\tEstado: " + order.getEstado());
                        }

                        System.out.println("Digite o id do pedido que deseja alterar: \n");
                        id_input = scanner.nextLine();

                        // Percorrendo a lista em busca do ID digitado pelo usuário
                        for (Pedido order : pedidos) {
                            if (id_input.equals(order.getId())) {

                                // "verifier" assume "true", já que os ID's bateram
                                verifier = true;

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

                                // "break" usado pra quebrar o loop de for quando o ID for encontrado
                                break;

                            }




                        }

                        /*
                         * "if" que verifica o valor de "verifier" e printa a mensagem de erro caso verifier valer
                         * "false"
                         */
                        if (!verifier) {
                            System.out.println("ID invalido, tente novamente.");
                        }

                    } else {
                        System.out.println("Senha invalida, tente novamente.");
                    }

                    break;

                /*
                 * "Case" que printa a mensagem de saída antes de fechar o programa
                 */
                case 4:
                    System.out.println("Mais um otimo dia de trabalho! Desligando o sistema...");

                    break;

            }

        } while (op != 4);

    }

}
