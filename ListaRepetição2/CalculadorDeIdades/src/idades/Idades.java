package idades;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp = 1, pessoas = 0;
		float idade = 0, soma = 0, media = 0;
		
		while(resp != 0) {
			System.out.print("Digite a idade da pessoa: ");
			idade = sc.nextFloat();
			
			if(idade >= 18) {
				soma += idade;
				pessoas ++;
			}
			
			System.out.println("");
			System.out.print("Deseja continuar cadastrando: [1= sim / 0= não] ");
			resp = sc.nextInt();
			System.out.println("");
		}
		System.out.println("");
		media = soma / pessoas;
		System.out.printf("A media de idade das %d pessoas maiores de idade é: %.2f", pessoas, media);
	}
}
