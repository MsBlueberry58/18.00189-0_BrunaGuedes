//Lista de exercícios
//1. Elabore um programa que pede para o usuário informar R.A., nome completo, 
//telefone, email e idade. Apresente essas informações no formato chave:valor. 

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

    class Ex1 {
        public static void main (String[] args){
            Scanner ler = new Scanner (System.in);
            String nome, email;
            int ra, telefone, idade;

            System.out.println("Digite seu RA: ");
            ra = ler.nextInt();
            System.out.println("Digite seu nome completo: ");
            nome = ler.next();
            System.out.println("Digite seu telefone: ");
            telefone = ler.nextInt();
            System.out.println("Digite seu email: ");
            email = ler.next();
            System.out.println("Digite seu sua idade: ");
            idade = ler.nextInt();
            System.out.printf("RA: %i\nNome: %s\nTelefone: %i\nEmail: %s\nIdade: %i", ra, nome, telefone, email, idade);
        }
    }