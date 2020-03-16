//Lista de exercícios
//4. Ler uma frase e verificar se ela é ou não um palíndromo.

import java.util.Scanner;

class Ex4 {
    public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            String frase, fraser, frasese, fraserse;

            System.out.println("Digite uma frase: ");
            frase = scanner.nextLine();
            fraser = new StringBuilder(frase).reverse().toString();

            frasese = frase.replace(" ", "");
            fraserse = fraser.replace(" ", "");

            if(frasese.equals(fraserse)){
                System.out.println("A frase é um palíndromo.");
            }
            else{
                System.out.println("A frase não é um palíndromo.");                
            }
                

            }
}