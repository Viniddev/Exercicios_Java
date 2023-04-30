package exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.printf("O numero %d é par", num);
		}else {
			System.out.printf("O numero %d é impar", num);
		}
	}
}
