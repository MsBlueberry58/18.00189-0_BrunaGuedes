/////// DUPLA //////
// Bruna Galastri Guedes - 18.00189-0 /////
// Rodolfo Cochi - 18.00202-0 //////
////////////////////

package app;

import java.util.Scanner;

import models.Funcionario;
import num.Horarios;


public class Main {
    public static void main(String[] args) throws Exception {
        Horarios horario = Horarios.NORMAL;
        int op;
        System.out.println("Bem-vindo!");
        
        
        do {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Horario de trabalho atual: " + horario);
            System.out.println("Menu: \n 1- Cadastrar usuario \n 2 - Remover usuario \n 3 - Trocar horario de trabalho \n 4 - Postar mensagens \n 0 - Sair \n");
            op = scanner.nextInt();
            
            
            switch (op) {
                case 1:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Digite o usuario e o email do funcionario: \n");


                    break;

                case 2:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Escolha o funcionario que deseja remover: \n");


                    break;
                case 3:
                if(horario == Horarios.NORMAL){
                   horario =  Horarios.EXTRA;
                }
                else{
                    horario =  Horarios.NORMAL;
                }
                

                    break;
                case 4:

                    break;

            }

        } while (op != 0);
    }
}