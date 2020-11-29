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
                    System.out.println("Animes: ");
                    personagens.forEach(personagem -> System.out.println(personagem));
                    break;
            }
        } while (rodar);
    }

    /**
     * Método criado para mostrar o menu na tela, de forma a não poluir o programa
     */
    private void menu() {
        System.out.println("DB_Animes:");
        System.out.println("1 - Animes Cadastrados");
        System.out.println("2 - Mangas Cadastrados");
        System.out.println("3 - Procurar anime");
        System.out.println("4 - Procurar manga");
        System.out.println("0 - Sair");
    }
}
