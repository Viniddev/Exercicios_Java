package exercicio02;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[6];
		
		for(int n = 0; n < 6; n++) {
			System.out.print("Digite um número: ");
			numeros[n] = sc.nextInt();
		}
		
		System.out.println(" ");
		
		for(int n = 0; n < 6; n++) {
			System.out.print(numeros[5 - n] + ", ");
		}
		System.out.print("Fim.");
	}
}
