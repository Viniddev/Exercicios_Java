package exercicio04;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		System.out.print("Digite mais um número: ");
		b = sc.nextInt();
		
		if(a%b == 0) {
			System.out.print("A é divisível por B");
		}else {
			System.out.print("A não é divisível por B");
		}

	}
}
