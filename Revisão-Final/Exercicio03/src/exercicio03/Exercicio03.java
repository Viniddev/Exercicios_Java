package exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[6];
		int num = 0;
		
		for(int n = 0; n < 6; n++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				numeros[n] = num;
			}else {
				System.out.println("Digite um valor válido! ");
				n--;
			}
		}
		
		System.out.println(" ");
		
		for(int n = 0; n < 6; n++) {
			System.out.print(numeros[5 - n] + ", ");
		}
		System.out.print("Fim.");
	}
}
