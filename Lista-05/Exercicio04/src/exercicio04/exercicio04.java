package exercicio04;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = sc.next().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.printf("A letra '%s' é uma vogal", letra);
		}else {
			System.out.printf("A letra '%s' não é uma vogal", letra); 
		}
	}
}
