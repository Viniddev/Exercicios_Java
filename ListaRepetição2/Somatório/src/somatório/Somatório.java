package somatório;
import java.util.Scanner;

public class Somatório {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp = 1;
		float num = 0, soma = 0;
		
		while(resp != 0) {
			System.out.print("Digite um número: ");
			num = sc.nextFloat();
			
			soma += num;
			
			System.out.println("");
			System.out.print("Deseja continuar cadastrando: [1= sim / 0= não] ");
			resp = sc.nextInt();
			System.out.println("");
		}
		System.out.println("");
		System.out.printf("A soma dos números digitados foi %.1f", soma);
	}
}
