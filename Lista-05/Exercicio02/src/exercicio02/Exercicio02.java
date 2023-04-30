package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 10) {
			System.out.printf("O número %d está entre 0 e 10", num);
		}else {
			System.out.printf("O número %d não está ente 0 e 10", num);
		}
	}
}
