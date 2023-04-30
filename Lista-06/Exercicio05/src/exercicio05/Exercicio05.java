package exercicio05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		System.out.print("Digite mais um número: ");
		b = sc.nextInt();
		
		if(a > b) {
			System.out.print("O numero 1 é maior que o número 2");
		}else {
			System.out.print("O numero 2 é maior que o número 1");
		}
	}
}
