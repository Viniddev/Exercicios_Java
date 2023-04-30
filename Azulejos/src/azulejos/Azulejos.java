package azulejos;
import java.util.Scanner;

public class Azulejos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a altura da parede: [em m] ");
		float alt = sc.nextFloat();
		System.out.print("Qual a largura da parede: [em m] ");
		float larg = sc.nextFloat();
		System.out.print("Qual a altura do azulejo: [em m] ");
		float altazul = sc.nextFloat();
		System.out.print("Qual a altura do azulejo: [em m] ");
		float largazul = sc.nextFloat();
		
		float quant = (alt*larg) / (altazul*largazul);
		
		System.out.println("A quantidade de azulejos utilizados será: " + quant);

	}
}
