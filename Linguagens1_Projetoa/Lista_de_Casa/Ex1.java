//Lista de exercícios
//1. Elabore um programa que pede para o usuário informar R.A., nome completo, 
//telefone, email e idade. Apresente essas informações no formato chave:valor. 

import java.util.Scanner;

    class Ex1 {
        public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
            String nome, email,ra, telefone, idade;

            System.out.println("Digite seu RA: ");
            ra = scanner.nextLine();
            System.out.println("Digite seu nome completo: ");
            nome = scanner.nextLine();
            System.out.println("Digite seu telefone: ");
            telefone = scanner.nextLine();
            System.out.println("Digite seu email: ");
            email = scanner.nextLine();
            System.out.println("Digite seu sua idade: ");
            idade = scanner.nextLine();
            
            System.out.printf("RA: %s\nNome: %s\nTelefone: %s\nEmail: %s\nIdade: %s", ra, nome, telefone, email, idade);
        }
    }