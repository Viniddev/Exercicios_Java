package exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num, divisores =0, i;
		
		System.out.print("Digite um valor valor: ");
		num = sc.nextInt();
		
		for(i = num; i > 0; i--) {
			if(num % i == 0) {
				divisores++;
			}
		}
		System.out.printf("O número %.1f possui %.1f divisores", num, divisores);
	}
}
