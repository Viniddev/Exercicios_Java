package exercicio04;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int linha = 0, coluna = 0, maior = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um número: ");
				matriz[i][j] = sc.nextInt();
				
				if(i == 0 && j == 0) {
					maior = matriz[i][j];
					linha = 0;
					coluna = 0;
				}
				
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.printf("\nO maior número é %d e se encontra na posição matriz[%d][%d]", maior, linha, coluna);
	}
}
