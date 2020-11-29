package br.maua.DAO;


import br.maua.models.Personagem;
import br.maua.DAO.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AppDAO {
    private List<Personagem> personagens;
    private PersonagensDAO personagemDAO = new PersonagensDAO();
    private Scanner scanner;

    public AppDAO() {
        personagens = new ArrayList<>();
        personagemDAO = new PersonagensDAO();
        scanner = new Scanner(System.in);
    }

    /**
     * Método que contém a parte lógica do projeto.
     * @throws Exception
     */
    public void run() throws Exception {
        boolean rodar = true;
        do {
            menu();
            int op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 0:
                    rodar = false;
                    break;
                /**
                 * O caso 1 mostra todos os personagens cadastrados no banco de dados local.
                 */
                case 1:
                    personagens = personagemDAO.getAll();
                    System.out.println("Personagens: ");
                    personagens.forEach(personagem -> System.out.println(personagem));
                    break;

                /**
                 * O caso 2 cria um personagem de acordo com os desejos do usuário e o insere no banco de dados.
                 */
                case 2:
                    System.out.println("Insira o nome do seu personagem: \n");
                    String nomePers = scanner.nextLine();
                    System.out.println("Agora, escolha sua raça: \n1 - Humano \n2 - Orc\n 3 - Elfo");
                    int op_race = Integer.parseInt(scanner.nextLine());

                    switch (op_race){
                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                    }
            }
        } while (rodar);
    }

    /**
     * Método criado para mostrar o menu na tela, de forma a não poluir o programa
     */
    private void menu() {
        System.out.println("DB_Personagens:");
        System.out.println("1 - Personagens cadastrados");
        System.out.println("2 - Criar novo personagem");
        System.out.println("0 - Sair");
    }
}
