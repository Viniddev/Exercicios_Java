package exercicio09;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num = 1, triplo = 0;
		
		while(num != 0) {
			System.out.print("Digite um número: ");
			num = sc.nextFloat();
			
			if(num != 0) {
				triplo = num * 3;
				System.out.printf("O triplo do número %.1f é %.1f \n\n", num, triplo);
			}else {
				System.out.print("Fim do programa.\n\n");
			}
			
		}
	}
}
