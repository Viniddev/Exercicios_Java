package exercicio04;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[3][3];
		boolean aprovacao = false;
		int soma = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite um número: ");
				mat[i][j]= sc.nextInt();
				
				if(i == j) {
					aprovacao = true;
				}
				
				if(aprovacao) {
					soma += mat[i][j];
				}
			}
			aprovacao = false;
			System.out.println("");
		}
		System.out.print("A soma dos elementos acima da diagonal principal é: " + soma);
	}
}
