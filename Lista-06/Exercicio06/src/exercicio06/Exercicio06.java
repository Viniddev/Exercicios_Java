package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float num1, num2;
		float maior, menor;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextFloat();
		System.out.print("Digite mais um número: ");
		num2 = sc.nextFloat();
		
		if(num1>num2) {
			maior = num1;
			menor = num2;
		}else {
			maior = num2;
			menor = num1;
		}
		
		System.out.printf("Maior = %.2f e Menor = %.2f", maior, menor);
		
	}
}
