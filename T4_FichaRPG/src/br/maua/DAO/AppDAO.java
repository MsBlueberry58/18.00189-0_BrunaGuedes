package br.maua.DAO;


import br.maua.models.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AppDAO {
    private List<Personagem> personagens;
    private PersonagensDAO personagemDAO;
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
                    for (Personagem personagem : personagens) {
                        System.out.print(personagem + "\n");
                    }

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

                                    System.out.println("Insira a sua mana: ");
                                    int H_M_mana = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque: ");
                                    int H_M_atk = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque magico: ");
                                    int H_M_atkm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa : ");
                                    int H_M_def = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa magica: ");
                                    int H_M_defm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua velocidade: ");
                                    int H_M_vel = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua destreza: ");
                                    int H_M_des = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira a sua experiencia: ");
                                    int H_M_exp = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira o seu nivel atual: ");
                                    int H_M_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem HumanoMago = new Personagem(nomePers, "Humano", "Mago", H_M_mana, H_M_atk, H_M_atkm, H_M_def, H_M_defm, H_M_vel, H_M_des, H_M_exp, H_M_lvl);
                                    personagemDAO.insert(HumanoMago);
                                    System.out.println("Personagem criado: ");
                                    System.out.println(HumanoMago);

                                    break;

                                case 2:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: ");
                                    int H_C_mana = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque: ");
                                    int H_C_atk = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque magico: ");
                                    int H_C_atkm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa : ");
                                    int H_C_def = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa magica: ");
                                    int H_C_defm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua velocidade: ");
                                    int H_C_vel = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua destreza: ");
                                    int H_C_des = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira a sua experiencia: ");
                                    int H_C_exp = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira o seu nivel atual: ");
                                    int H_C_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem HumanoCavaleiro = new Personagem(nomePers, "Humano", "Cavaleiro", H_C_mana, H_C_atk, H_C_atkm, H_C_def, H_C_defm, H_C_vel, H_C_des, H_C_exp, H_C_lvl);
                                    personagemDAO.insert(HumanoCavaleiro);
                                    System.out.println("Personagem criado: ");
                                    System.out.println(HumanoCavaleiro);

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

                                    System.out.println("Insira a sua mana: ");
                                    int E_M_mana = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque: ");
                                    int E_M_atk = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque magico: ");
                                    int E_M_atkm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa : ");
                                    int E_M_def = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa magica: ");
                                    int E_M_defm = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua velocidade: ");
                                    int E_M_vel = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua destreza: ");
                                    int E_M_des = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua experiencia: ");
                                    int E_M_exp = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira o seu nivel atual: ");
                                    int E_M_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem ElfoMago = new Personagem(nomePers, "Elfo", "Mago", E_M_mana, E_M_atk, E_M_atkm, E_M_def, E_M_defm, E_M_vel, E_M_des, E_M_exp, E_M_lvl);
                                    personagemDAO.insert(ElfoMago);
                                    System.out.println("Personagem criado: ");
                                    System.out.println(ElfoMago);

                                    break;

                                case 2:
                                    //Buffs e debuffs de acordo com a raça/profissão do caso

                                    System.out.println("Insira a sua mana: ");
                                    int E_C_mana = ((Integer.parseInt(scanner.nextLine())) - 2);
                                    System.out.println("Insira o seu ataque: ");
                                    int E_C_atk = ((Integer.parseInt(scanner.nextLine())) + 2);
                                    System.out.println("Insira o seu ataque magico: ");
                                    int E_C_atkm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua defesa: ");
                                    int E_C_def = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua defesa magica: ");
                                    int E_C_defm = Integer.parseInt(scanner.nextLine()) - 1;
                                    System.out.println("Insira a sua velocidade: ");
                                    int E_C_vel = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua destreza: ");
                                    int E_C_des = Integer.parseInt(scanner.nextLine()) + 1;
                                    System.out.println("Insira a sua experiencia: ");
                                    int E_C_exp = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Insira o seu nivel atual: ");
                                    int E_C_lvl = Integer.parseInt(scanner.nextLine());

                                    Personagem ElfoCavaleiro = new Personagem(nomePers, "Elfo", "Cavaleiro", E_C_mana, E_C_atk, E_C_atkm, E_C_def, E_C_defm, E_C_vel, E_C_des, E_C_exp, E_C_lvl);
                                    personagemDAO.insert(ElfoCavaleiro);
                                    System.out.println("Personagem criado: ");
                                    System.out.println(ElfoCavaleiro);

                                    break;
                            }

                            break;
                    }

                    break;

                /**
                 * O caso 3 altera um personagem já existente o banco de dados.
                 */

                case 3:
                    personagens.forEach(personagem -> System.out.println(personagem));
                    System.out.println("Digite o nome do personagem que deseja alterar");
                    String id_pers = scanner.nextLine();

                    for (Personagem personagem : personagens) {
                        if (id_pers.equals(personagem.getNome())) {
                            System.out.println(personagem);
                            System.out.println("Escolha o atributo que deseja alterar: \n" +
                                    "1 - Nome \n2 - Raça \n3 - Profissao\n4 - Mana\n5 - Ataque \n6 - Ataque Magico \n" +
                                    "7 - Defesa \n8 - Defesa Magica \n9 - Velocidade \n10 - Destreza \n11 - XP \n12 - Nivel Atual");
                            int op_mudar = Integer.parseInt(scanner.nextLine());

                            switch (op_mudar) {

                                case 1:

                                    System.out.println("Digite o novo nome: \n");
                                    String new_name = scanner.nextLine();

                                    personagem.setNome(new_name);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 2:

                                    System.out.println("Digite a nova raça: \n");
                                    String new_race = scanner.nextLine();

                                    personagem.setRace(new_race);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 3:

                                    System.out.println("Digite a nova profissao: \n");
                                    String new_prof = scanner.nextLine();

                                    personagem.setProfissao(new_prof);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 4:

                                    System.out.println("Digite a nova mana: \n");
                                    int new_mana = Integer.parseInt(scanner.nextLine());

                                    personagem.setMana(new_mana);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);


                                    break;

                                case 5:

                                    System.out.println("Digite o novo ataque: \n");
                                    int new_atk = Integer.parseInt(scanner.nextLine());

                                    personagem.setAtaque(new_atk);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 6:

                                    System.out.println("Digite o novo ataque magico: \n");
                                    int new_spatk = Integer.parseInt(scanner.nextLine());

                                    personagem.setAtaque_Magico(new_spatk);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 7:

                                    System.out.println("Digite a nova defesa: \n");
                                    int new_def = Integer.parseInt(scanner.nextLine());

                                    personagem.setDefesa(new_def);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 8:

                                    System.out.println("Digite a nova defesa especial: \n");
                                    int new_spdef = Integer.parseInt(scanner.nextLine());

                                    personagem.setDefesa_Magica(new_spdef);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 9:

                                    System.out.println("Digite a nova velocidade: \n");
                                    int new_spd = Integer.parseInt(scanner.nextLine());

                                    personagem.setVelocidade(new_spd);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 10:

                                    System.out.println("Digite a nova destreza: \n");
                                    int new_dex = Integer.parseInt(scanner.nextLine());

                                    personagem.setDestreza(new_dex);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 11:

                                    System.out.println("Digite a nova experiencia: \n");
                                    int new_xp = Integer.parseInt(scanner.nextLine());

                                    personagem.setExp(new_xp);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;

                                case 12:

                                    System.out.println("Digite o novo nivel: \n");
                                    int new_lvl = Integer.parseInt(scanner.nextLine());

                                    personagem.setNivel_Atual(new_lvl);

                                    System.out.println("Novos dados do personagem: \n");
                                    System.out.println(personagem);

                                    break;
                            }
                        }

                    }

                    break;

                /**
                 * O caso 4 remove um personagem do banco de dados.
                 */

                case 4:
                    personagens.forEach(personagem -> System.out.println(personagem));
                    System.out.println("Digite o nome do personagem que deseja remover: ");
                    String id_pers_delete = scanner.nextLine();

                    for (Personagem personagem : personagens) {
                        if (id_pers_delete.equals(personagem.getNome())){
                            personagemDAO.remove(personagem,id_pers_delete);
                        }
                    }

                    break;
            }
        } while (rodar);
    }

    /**
     * Método criado para mostrar o menu na tela, de forma a não poluir o programa
     */
    private void menu() {
        System.out.println("Bem vindo ao RPG Topzera do Zanini!");
        System.out.println("1 - Visualizar personagens cadastrados");
        System.out.println("2 - Criar novo personagem");
        System.out.println("3 - Alterar personagem existente");
        System.out.println("4 - Remover personagem");
        System.out.println("0 - Sair");
    }
}
