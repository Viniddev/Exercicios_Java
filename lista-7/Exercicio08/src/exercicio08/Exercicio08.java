package exercicio08;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		float media = 0, num = 0;
		
		System.out.print("Quantos números deseja digitar: ");
		int n = sc.nextInt();
		
		while(cont < n) {
			System.out.print("Digite um número: ");
			num = sc.nextFloat();
			media += num;
			cont ++;
		}
		media = media / n;
		System.out.printf("A media dos %d números digitados é %.2f", n, media);
	}
}
