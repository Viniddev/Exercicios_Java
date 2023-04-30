package exercicio11;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float media = 0, num = 0;
		int numeros = 0;
		
		while(num >= 0) {
			System.out.print("Digite um número: ");
			num = sc.nextFloat();
			
			if(num > 0) {
				media += num;
				numeros ++;
			}else {
				break;
			}
		}
		media = media / numeros;
		System.out.printf("A media dos %d números digitados é %.2f", numeros, media);
	}
}
