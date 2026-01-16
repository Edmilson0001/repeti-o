package repeticao;

import java.util.Scanner;

public class mainum {

	public static void main(String[] args) {
		/*Scanner texto = new Scanner(System.in);
		String user = "";
		String senha = "";
		while (!(user.equals("Admin") && senha.equals("123456"))) {
			System.out.println("Digite seu Login: ");
			user = texto.nextLine();
			System.out.println("Digite sua senha: ");
			senha = texto.nextLine();
			if (!(user.equals("Admin") && senha.equals("123456"))) {
				System.out.println("Usuario ou Senha incorreta!");
			} else {
				System.out.println("Entrada Liberada!");
			}

		}*/
      /*int cont = 1;
      do {
    	  System.out.println(cont);
    	  cont++;
      }while(cont<1);*/
	
	//While True
	 while(true) {
		System.out.println("1 - Entrar\n2 - Cadastrar\n3 - Encerrar Porgrama");
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		int opcao = input.nextInt();
		if(opcao==1) {
			System.out.println("Tela de Entrada!");
		}else if (opcao==2) {
			System.out.println("Tela de cadastro!");
		}else if (opcao==3) {
			System.out.println("Programa com o danilo foi encerrado com sucesso!");
			break;
		}else {
			System.out.println("Entre com uma opção válida!");
			
		}
	}
	
}
}
