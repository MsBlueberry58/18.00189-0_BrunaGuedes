import java.util.Scanner;

public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String e xec = "1";

        // Criar conta
        String nick, senha, email;
        double cred = 0;
        System.out.println("Criacao de conta\n");
        System.out.println("Digite um nick: ");
        nick = scanner.nextLine();
        System.out.println("Crie uma senha: ");
        senha = scanner.nextLine();
        System.out.println("Digite seu email: "); 
        email = scanner.nextLine();
        Usuario user = new Usuario(nick, senha, email);
        Conta conta = new Conta (user);
        System.out.println("Nova conta criada com sucesso: \nUser: " + user.getNickname() + "\nConta: " + conta.getInfo());

         // Login
        System.out.println("Login\n");
        String lognick, logpass;
        do{
            System.out.println("Digite seu nick: ");
            loguser = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            logpass = scanner.nextLine();

        } while(!((loguser.equals(nick)) && (logpass.equals(senha))));
        
        // Menu
        String choice;

        do {
        System.out.println("Menu: \n1 - Trocar de usuario \n2 - Info conta \n3 - Adicionar jogos \n4 - Adicionar creditos \n5 - Criar outra conta \n6 - Sair\n ");
        choice = scanner.nextLine();
        
        // Trocar de usuario
        if(choice.equals("1")){
            exec.equals("1");

        }

        // Informações sobre conta atual
        else if(choice.equals("2")){
            System.out.println("Informacoes da conta: \n" + conta.getInfo());
            exec.equals("1");
        }

        // Add jogos
        else if(choice.equals("3")){
            String nome, genero, descricao, op;
            Jogo jogo;
            do{
                System.out.println("Digite o nome do jogo: ");
                nome = scanner.nextLine();
                System.out.println("Digite o genero do jogo: ");
                genero = scanner.nextLine();
                System.out.println("Digite a descricao do jogo: ");
                descricao = scanner.nextLine();
                jogo = new Jogo(nome, genero, descricao);
                conta.addJogo(jogo);
                System.out.println("Deseja continuar adicionando? (s/n): ");
                op = scanner.nextLine();

            } while(op.equals("s"))
           
            System.out.println("Lista de jogos atual: " + conta.getJogos());
            exec.equals("1");

        }
    
        // Add créditos
        else if(choice.equals("4")){
            String op;
            double quant;
            System.out.println("Saldo atual: " conta.getCreditos());
            do{
                System.out.println("Digite a quantidade de creditos que deseja adicionar: ");
                quant = scanner.nextDouble();
                conta.addCreditos(quant);
                System.out.println("Saldo atual: " + conta.getCreditos());
                System.out.println("Deseja continuar adicionando? (s/n): ");
                op = scanner.nextLine();
            } while (op.equals("s"));

            exec.equals("1");

            
        }
    
        // Criar outra conta
        else if(choice.equals("5")){
            String nick, senha, email;
            double cred = 0;
            System.out.println("Criacao de conta\n");
            System.out.println("Digite um nick: ");
            nick = scanner.nextLine();
            System.out.println("Crie uma senha: ");
            senha = scanner.nextLine();
            System.out.println("Digite seu email: "); 
            email = scanner.nextLine();
            Usuario user = new Usuario(nick, senha, email);
            Conta conta = new Conta (user);
            System.out.println("Nova conta criada com sucesso: \nUser: " + user.getNickname() + "\nConta: " + conta.getInfo());
            exec.equals("1");
            }
    
        // Logout
        else if(choice.equals("6")){
            System.exit(0);
        }

        else{
            System.out.println("Comando invalido! Tente novamente.")
            exec.equals("1");
        }
    
        } while(exec.equals("1"));
    }
