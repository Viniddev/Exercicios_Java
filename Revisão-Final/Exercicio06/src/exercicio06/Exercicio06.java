package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[3][3];
		int soma = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite um número: ");
				mat[i][j]= sc.nextInt();
				
				if(i == j) {
					soma += mat[i][j];
				}
			}
			System.out.println("");
		}
		System.out.print("A soma dos elementos sobre diagonal principal é: " + soma);

	}

}
