//Lista de exercícios
//6. Elabore um programa que permita o usuário informar o valor inicial e final de
//uma sequência, apresente a somatória e o produto entre todos os valores do
//intervalo.

import java.util.Scanner;

    public class Ex6 {
        public static void main (String[] args){
            
            Scanner scanner = new scanner(System.in);
            int vali, valo, i;
            int soma = 0;
            int mult = 1;

            System.out.println("Digite o valor inicial da sequência: ");
            vali = scanner.nextInt();
            System.out.println("Digite o valor final da sequência: ");
            valo = scanner.nextInt();

            for (i = vali; i<=valo; i++){
                soma = soma + i;
                mult = mult * i;
            }

            System.out.println("Valor inicial: " + vali);
            System.out.println("Valor final: " + valo);
            System.out.println("Somatória: " + soma);
            System.out.println("Produto: " + mult);



        }
    }