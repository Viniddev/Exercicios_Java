package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2, somatorio;
		somatorio = 0;
		
		System.out.print("Digite o Primeiro valor: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o Segundo valor: ");
		num2 = sc.nextFloat();
	
		
		while(num1 <= num2) {
			
			if(num1 % 2 == 0) {
				somatorio += num1;
				// somatorio = somatorio + num1
			}
			
			num1 += 1;
			// num1 = num1 + 1
			// num1 ++
		}	
		System.out.printf("\n A soma dos n�meros pares é: %.1f", somatorio);
	}
}
