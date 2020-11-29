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
     *
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
                    System.out.println("Agora, escolha sua raça: \n1 - Humano \n2 - Elfo\n");
                    int op_race = Integer.parseInt(scanner.nextLine());

                    switch (op_race) {

                        case 1:
                            System.out.println("Qual sua profissao desejada?\n");
                            System.out.println("1 - Mago \n2 - Cavaleiro \n");
                            int op_prof_H = Integer.parseInt(scanner.nextLine());

                            switch (op_prof_H) {
                                case 1:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: \n");
                                    int H_M_mana = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque: \n");
                                    int H_M_atk = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque magico: \n");
                                    int H_M_atkm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa : \n");
                                    int H_M_def = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa magica: \n");
                                    int H_M_defm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua velocidade");
                                    int H_M_vel = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua destreza");
                                    int H_M_des = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira a sua experiencia");
                                    int H_M_exp = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira o seu nivel atual");
                                    int H_M_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem HumanoMago = new Personagem(nomePers, "Humano", "Mago", H_M_mana, H_M_atk, H_M_atkm, H_M_def, H_M_defm, H_M_vel, H_M_des, H_M_exp, H_M_lvl);
                                    personagens.add(HumanoMago);
                                    System.out.println("Personagem criado: \n");
                                    personagens.forEach(personagem -> System.out.println(personagem));

                                    break;

                                case 2:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: \n");
                                    int H_C_mana = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque: \n");
                                    int H_C_atk = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque magico: \n");
                                    int H_C_atkm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa : \n");
                                    int H_C_def = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa magica: \n");
                                    int H_C_defm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua velocidade");
                                    int H_C_vel = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua destreza");
                                    int H_C_des = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira a sua experiencia");
                                    int H_C_exp = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira o seu nivel atual");
                                    int H_C_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem HumanoCavaleiro = new Personagem(nomePers, "Humano", "Cavaleiro", H_C_mana, H_C_atk, H_C_atkm, H_C_def, H_C_defm, H_C_vel, H_C_des, H_C_exp, H_C_lvl);
                                    personagens.add(HumanoCavaleiro);
                                    System.out.println("Personagem criado: \n");
                                    personagens.forEach(personagem -> System.out.println(personagem));

                                    break;

                            }


                            break;

                        case 2:
                            System.out.println("Qual sua profissao desejada?\n");
                            System.out.println("1 - Mago \n2 - Cavaleiro \n");
                            int op_prof_E = Integer.parseInt(scanner.nextLine());

                            switch (op_prof_E) {
                                case 1:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: \n");
                                    int E_M_mana = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque: \n");
                                    int E_M_atk = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque magico: \n");
                                    int E_M_atkm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa : \n");
                                    int E_M_def = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa magica: \n");
                                    int E_M_defm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua velocidade");
                                    int E_M_vel = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua destreza");
                                    int E_M_des = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua experiencia");
                                    int E_M_exp = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira o seu nivel atual");
                                    int E_M_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem ElfoMago = new Personagem(nomePers, "Elfo", "Mago", E_M_mana, E_M_atk, E_M_atkm, E_M_def, E_M_defm, E_M_vel, E_M_des, E_M_exp, E_M_lvl);
                                    personagens.add(ElfoMago);
                                    System.out.println("Personagem criado: \n");
                                    personagens.forEach(personagem -> System.out.println(personagem));

                                    break;

                                case 2:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: \n");
                                    int E_C_mana = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque: \n");
                                    int E_C_atk = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque magico: \n");
                                    int E_C_atkm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa : \n");
                                    int E_C_def = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa magica: \n");
                                    int E_C_defm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua velocidade");
                                    int E_C_vel = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua destreza");
                                    int E_C_des = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua experiencia");
                                    int E_C_exp = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira o seu nivel atual");
                                    int E_C_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem ElfoCavaleiro = new Personagem(nomePers, "Elfo", "Cavaleiro", E_C_mana, E_C_atk, E_C_atkm, E_C_def, E_C_defm, E_C_vel, E_C_des, E_C_exp, E_C_lvl);
                                    personagens.add(ElfoCavaleiro);
                                    System.out.println("Personagem criado: \n");
                                    personagens.forEach(personagem -> System.out.println(personagem));

                                    break;

                            }

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
        System.out.println("1 - Visualizar personagens cadastrados");
        System.out.println("2 - Criar novo personagem");
        System.out.println("3 - Alterar personagem existente");
        System.out.println("4 - Remover personagem");
        System.out.println("0 - Sair");
    }
}
