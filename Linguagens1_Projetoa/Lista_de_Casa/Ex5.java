//Lista de exercícios
//5. Elabore um programa que determine o enésimo valor da sequência de
//Fibonnacci.

import java.util.Scanner;

    public class Ex5 {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            int val, i;
            int MAX = 50;
            // O que significa e o que é inicializar valor?
            int [] fib = new int[MAX];
            fib [0] = 1;
            
            
            System.out.println("Digite o número do valor desejado: ");
            val = scanner.nextInt();
            
          for (i = 1; i<=(val+1); i++){
              fib[i] = fib[i] + fib[i-1];
          }

            System.out.printf("O valor da casa %i na sequência de Fibonnacci é %i", val, fib[val+1]);
        }
    }