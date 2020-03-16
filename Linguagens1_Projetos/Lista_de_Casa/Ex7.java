//Lista de exercícios
//7. O usuário informa um valor e você apresenta a soma de todos os algarismos
//dele.

import java.util.Scanner;

    public class Ex7 {
        public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
            int i, valor;
            int soma = 0;
            
            System.out.println("Digite um número: ");
            valor = scanner.nextInt();

            do{
                soma = soma + (valor % 10);
                valor = valor/10;

            } while (valor>0);

            System.out.println("A soma dos algarismos vale: " + soma);
        }
    }