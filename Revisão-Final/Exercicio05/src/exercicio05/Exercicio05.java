package exercicio05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[3][3];
		boolean aprovacao = true;
		int soma = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite um número: ");
				mat[i][j]= sc.nextInt();
				
				if(i == j) {
					aprovacao = false;
				}
				
				if(aprovacao) {
					soma += mat[i][j];
				}
			}
			aprovacao = true;
			System.out.println("");
		}
		System.out.print("A soma dos elementos abaixo da diagonal principal é: " + soma);
	}
}
