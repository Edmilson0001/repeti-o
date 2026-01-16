package loteria;
import java.util.Scanner;
import java.security.SecureRandom;
import java.security.*;
import java.util.Arrays;

public class aposta {

	public static void main(String[] args) {
		int[][] bilhete = new int[2][3];
		int[][] resultado = new int[2][3];
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Apostar na mega\n2 - sortear\n3 - Encerrar sistema");
			System.out.println("Escolha uma opção: ");
			int op = input.nextInt();
			if (op == 1) {
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.println("Escolha seu número de 1 à 60: ");
						bilhete[i][j] = input.nextInt();
					}

				}
				System.out.println("Valores apostados!");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(bilhete[i][j] + "|");
					}
					System.out.println("");
				}
			} else if (op == 2) {
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 3; j++) {
						resultado[i][j] = new SecureRandom().nextInt(60);
					}
				}
				System.out.println("Resultado do sorteio: ");
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.println(resultado[i][j] + "|");
					}
					System.out.println("");
				}
				if(Arrays.equals(bilhete, resultado)) {
					System.out.println("Parabéns, Você ganhou");
				}else {
					System.out.println("Você continua liso");
				}

			} else if (op == 3) {
				System.out.println("Obrigado por jogar conosco!");
				break;
			}
		}
	}
}