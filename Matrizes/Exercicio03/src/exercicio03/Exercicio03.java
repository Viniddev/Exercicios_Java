package exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matriz[i][j] = i * j;
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}
