package matriz;

import java.util.Scanner;

public class maintres {

	public static void main(String[] args) {
		int linha = 3;
		int coluna = 3;
		Scanner input = new Scanner(System.in);
		// int[][] matriz = {{4,8,2},{3,7,9},{1,5,6}};
		int[][] matriz = new int[linha][coluna];
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Digite o número da linha " + (i+1) + " e da coluna " + (j+1));
				matriz[i][j] = input.nextInt();
				// System.out.print(matriz[i][j] + " ");
			}
		}
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		
		System.out.println(" ");
		}
	}

}
