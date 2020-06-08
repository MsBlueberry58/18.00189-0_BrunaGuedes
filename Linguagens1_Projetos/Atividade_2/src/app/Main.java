/////// DUPLA //////
// Bruna Galastri Guedes - 18.00189-0 /////
// Rodolfo Cochi - 18.00202-0 //////
////////////////////

package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import models.BigBrothers;
import models.Funcionario;
import models.HeavyLifters;
import models.MobileMembers;
import models.ScriptGuys;
import num.Horarios;
import num.Funcoes;

/**
 * App principal, onde ocorrem interações com o usuário, envolvendo input, menu,
 * etc...
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Horarios horario = Horarios.NORMAL;
        int op;
        ArrayList<Funcionario> EmploList = new ArrayList<>();

        System.out.println("Bem-vindo!");

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Horario de trabalho atual: " + horario);
            System.out.println(
                    "Menu: \n 1- Cadastrar usuario \n 2 - Remover usuario \n 3 - Trocar horario de trabalho \n 4 - Postar mensagens \n 5 - Mostrar funcionarios \n 0 - Sair \n");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1:
                    String name, email;
                    int opc;

                    System.out.println(
                            "Digite o cargo que deseja: \n 1 - Script Guy \n 2  - Mobile Member \n 3 - Heavy Lifter \n 4 - Big Brother");
                    opc = Integer.parseInt(scanner.nextLine());

                    switch (opc) {

                        case 1:

                            System.out.println("Digite o nome do usuario: ");
                            name = scanner.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner.nextLine();

                            EmploList.add(new ScriptGuys(name, email));

                            for (Funcionario func : EmploList) {
                                System.out.println("Nome: " + func.getNome());
                                System.out.println("Email: " + func.getEmail());
                                System.out.println("Cargo: " + Funcoes.SCRIPT_GUYS);

                            }

                            break;
                        case 2:
                            System.out.println("Digite o nome do usuario: ");
                            name = scanner.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner.nextLine();

                            EmploList.add(new MobileMembers(name, email));

                            for (Funcionario func : EmploList) {
                                System.out.println("Nome: " + func.getNome());
                                System.out.println("Email: " + func.getEmail());
                                System.out.println("Cargo: " + Funcoes.MOBILE_MEMBERS);

                            }

                            break;
                        case 3:
                            System.out.println("Digite o nome do usuario: ");
                            name = scanner.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner.nextLine();

                            EmploList.add(new HeavyLifters(name, email));

                            for (Funcionario func : EmploList) {
                                System.out.println("Nome: " + func.getNome());
                                System.out.println("Email: " + func.getEmail());
                                System.out.println("Cargo: " + Funcoes.HEAVY_LIFTERS);

                            }

                            break;
                        case 4:
                            System.out.println("Digite o nome do usuario: ");
                            name = scanner.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner.nextLine();

                            EmploList.add(new BigBrothers(name, email));

                            for (Funcionario func : EmploList) {
                                System.out.println("Nome: " + func.getNome());
                                System.out.println("Email: " + func.getEmail());
                                System.out.println("Cargo: " + Funcoes.BIG_BROTHERS);

                            }

                            break;

                    }
                    break;
                case 2:
                    String demitido;

                    for (Funcionario func : EmploList) {
                        if(func instanceof ScriptGuys){
                            System.out.println("Nome: " + func.getNome() + "Cargo: " + Funcoes.SCRIPT_GUYS);
                        }
                        else if(func instanceof MobileMembers){
                            System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.MOBILE_MEMBERS);
                        }
                        else if(func instanceof HeavyLifters){
                            System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.HEAVY_LIFTERS);
                        }
                        else if(func instanceof BigBrothers){
                            System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.BIG_BROTHERS);
                        }
                    }

                    System.out.println("Escolha o nome do funcionario que deseja remover: ");
                    demitido = scanner.nextLine();

                    for (Funcionario func : EmploList) {
                        if (demitido.equals(func.getNome())) {
                            EmploList.remove(func);
                            System.out.println("Funcionario " + func.getNome() + " removido com sucesso.");
                        }
                        else{
                            System.out.println("Funcionario nao encontrado.");
                        }

                    }

                    break;

                case 3:
                    if (horario == Horarios.NORMAL) {
                        horario = Horarios.EXTRA;
                    } else {
                        horario = Horarios.NORMAL;
                    }

                    break;

                case 4:
                    if (horario == Horarios.NORMAL) {
                        for (Funcionario value : EmploList) {
                            System.out.println(value.getNome() + ": ");
                            value.MsgNormal();
                        }

                    } else {
                        for (Funcionario value : EmploList) {
                            System.out.println(value.getNome() + ": ");
                            value.MsgExtra();
                        }
                    }

                    break;

                case 5: 

                for (Funcionario func : EmploList) {
                    if(func instanceof ScriptGuys){
                        System.out.println("Nome: " + func.getNome() + "Cargo: " + Funcoes.SCRIPT_GUYS);
                    }
                    else if(func instanceof MobileMembers){
                        System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.MOBILE_MEMBERS);
                    }
                    else if(func instanceof HeavyLifters){
                        System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.HEAVY_LIFTERS);
                    }
                    else if(func instanceof BigBrothers){
                        System.out.println("Nome: " + func.getNome() + "Cargo: "  + Funcoes.BIG_BROTHERS);
                    }
                }

                break;

            }

        } while (op != 0);
    }
}