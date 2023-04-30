package exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num;
		
		
		System.out.print("Digite um número: ");
		num = sc.nextFloat();
		
		if(num < 0 || num > 10) {
			System.out.print("Número não está entre 0 e 10 \n");
		}else {
			System.out.print("Numero entre 0 e 10. \n");
		}
		
		
		if(num > 10) {
			System.out.print("Número maior que 10");
		}else {
			System.out.print("Número menor que 10");
		}
		
		
	}
}
