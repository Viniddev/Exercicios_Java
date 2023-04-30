package exercicio03;
import java.util.Scanner;

public interface Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextFloat();
		
		if(num1 % 2 == 0) {
			System.out.print("O número digitado é par");
		}else {
			System.out.print("O número digitado é impar");
		}
		
	}
}