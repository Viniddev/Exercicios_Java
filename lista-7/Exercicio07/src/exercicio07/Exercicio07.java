package exercicio07;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, pares = 0, impares = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				pares ++;
			}else {
				impares ++;
			}
		}
		System.out.printf("Foram digitados %d números pares e %d números impares", pares, impares);
	}
}
