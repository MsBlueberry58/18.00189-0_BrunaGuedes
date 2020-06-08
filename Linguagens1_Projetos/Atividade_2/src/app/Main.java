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
import num.Funcoes;
import num.Horarios;
import outros.Lista;

public class Main {
    public static void main(String[] args) throws Exception {
        Horarios horario = Horarios.NORMAL;
        int op;
        HashMap<String, Funcoes> FuncList = new HashMap<>();
        ArrayList<Funcionario> EmploList = new ArrayList<>();

        System.out.println("Bem-vindo!");

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Horario de trabalho atual: " + horario);
            System.out.println(
                    "Menu: \n 1- Cadastrar usuario \n 2 - Remover usuario \n 3 - Trocar horario de trabalho \n 4 - Postar mensagens \n 0 - Sair \n");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    int opc;
                    String email, name;
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println(
                            "Digite o cargo que deseja: \n 1 - Script Guy \n 2  - Mobile Member \n 3 - HeaVY Lifter \n 4 - Big Brother");
                    opc = scanner2.nextInt();

                    switch (opc) {
                        case 1:

                            System.out.println("Digite o nome do usuario: ");
                            name = scanner2.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner2.nextLine();

                            Funcionario employee1 = new ScriptGuys(name, email);
                            EmploList.add(employee1);
                            FuncList.put(name, Funcoes.SCRIPT_GUYS);

                            break;
                        case 2:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner2.nextLine();
                            System.out.println("Email: \n");
                            email = scanner2.nextLine();

                            Funcionario employee2 = new MobileMembers(name, email);
                            EmploList.add(employee2);
                            FuncList.put(name, Funcoes.SCRIPT_GUYS);

                            break;
                        case 3:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner2.nextLine();
                            System.out.println("Email: \n");
                            email = scanner2.nextLine();

                            Funcionario employee3 = new HeavyLifters(name, email);
                            EmploList.add(employee3);
                            FuncList.put(name, Funcoes.SCRIPT_GUYS);

                            break;
                        case 4:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner2.nextLine();
                            System.out.println("Email: \n");
                            email = scanner2.nextLine();

                            Funcionario employee4 = new BigBrothers(name, email);
                            EmploList.add(employee4);
                            FuncList.put(name, Funcoes.SCRIPT_GUYS);

                            break;

                    }

                case 2:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Escolha o funcionario que deseja remover: \n");

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
                            value.MsgNormal();
                        }

                    } else {
                        for (Funcionario value : EmploList) {
                            value.MsgExtra();
                        }
                    }

                    break;

            }

        } while (op != 0);
    }
}