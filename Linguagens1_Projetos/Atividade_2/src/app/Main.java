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

/** App principal, onde ocorrem interações com o usuário, envolvendo input, menu, etc... */


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
                    "Menu: \n 1- Cadastrar usuario \n 2 - Remover usuario \n 3 - Trocar horario de trabalho \n 4 - Postar mensagens \n 0 - Sair \n");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1:
                    int opc;
                    String email;
                    System.out.println(
                            "Digite o cargo que deseja: \n 1 - Script Guy \n 2  - Mobile Member \n 3 - Heavy Lifter \n 4 - Big Brother");
                    opc = Integer.parseInt(scanner.nextLine());

                    switch (opc) {

                        case 1:

                            System.out.println("Digite o nome do usuario: ");
                            String name = scanner.nextLine();
                            System.out.println("Digite o email do usuario: ");
                            email = scanner.nextLine();
                            
                            EmploList.add(new ScriptGuys(name, email));
                            

                            break;
                        case 2:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner.nextLine();
                            System.out.println("Email: \n");
                            email = scanner.nextLine();

                            EmploList.add(new MobileMembers(name, email));
                            

                            break;
                        case 3:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner.nextLine();
                            System.out.println("Email: \n");
                            email = scanner.nextLine();

                            EmploList.add(new HeavyLifters(name, email));
                            

                            break;
                        case 4:
                            System.out.println("Digite o nome e o email do funcionario: \n");
                            System.out.println("Nome: \n");
                            name = scanner.nextLine();
                            System.out.println("Email: \n");
                            email = scanner.nextLine();

                            EmploList.add(new BigBrothers(name, email));
                            

                            break;

                    }

                case 2:
                    String demitido;
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Escolha o nome do funcionario que deseja remover: \n");
                    demitido = scanner3.nextLine();

                    for(Funcionario func : EmploList){
                        if(demitido.equals(func.getNome())){
                            EmploList.remove(func);
                        }
                        else{
                            System.out.println("Funcionario nao encontrado");
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