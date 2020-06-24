import java.util.Scanner;

public class Main_Sistema {
    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a Pizzaria Rato Que Ri!");

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Nova venda \n2 - Verificar pedidos \n3 - Alterar pedidos\n4 - Sair");
            op = Integer.parseInt(scanner.nextLine());

            switch(op) {

                case 1:


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
