package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int matriz2[][] = new int[4][4];
		int matriz3[][] = new int[4][4];

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um número para a matriz 1: ");
				matriz[i][j] = sc.nextInt();
				
				System.out.println(" ");
				
				System.out.print("Digite um número para a matriz 2: ");
				matriz2[i][j] = sc.nextInt();
				
				if(matriz[i][j] > matriz2[i][j]) {
					matriz3[i][j] = matriz[i][j];
				}else if(matriz[i][j] < matriz2[i][j]) {
					matriz3[i][j] = matriz2[i][j];
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz3[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}
