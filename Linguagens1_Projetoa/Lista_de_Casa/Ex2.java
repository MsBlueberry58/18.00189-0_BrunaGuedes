//Lista de exercícios
//2. Elabore um programa que leia dois nomes e duas idades, exiba a diferença
//entre essas idades na tela.

import java.util.Scanner;

    class Ex2{
        public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
            String nome1, nome2;
            int idade1, idade2, dif;

            System.out.println("Digite o primeiro nome: ");
            nome1 = scanner.nextLine();
            System.out.println("Digite a primeira idade: ");
            idade1 = scanner.nextInt();
            System.out.println("Digite o segundo nome: ");
            nome2 = scanner.nextLine();
            System.out.println("Digite a segunda idade: ");
            idade2 = scanner.nextInt();

            //Cálculo da diferença
            if (idade1>=idade2){
                dif = idade1-idade2;
             }
             else {
                dif = idade2-idade1;
             }
            

            System.out.println("Diferença entre as idades: " + dif);

        }
    }