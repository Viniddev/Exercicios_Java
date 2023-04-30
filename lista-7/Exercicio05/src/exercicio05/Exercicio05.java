package exercicio05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num , maior, menor;
		maior = 0;
		menor = maior;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextFloat();
			
			if(i == 1) {
				maior = num;
				menor = num;
			}
			
			if(num > maior) {
				maior = num;
			}else if(num < menor) {
				menor = num;
			}
		}
		System.out.printf("O maior número é %.2f e o menor é %.2f", maior, menor);
	}
}
