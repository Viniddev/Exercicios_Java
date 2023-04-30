package exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int pares = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um número: ");
				matriz[i][j] = sc.nextInt();
				
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}
			}
		}
		
		System.out.printf("Na matriz digitada, houveram %d números pares", pares);
	}
}
