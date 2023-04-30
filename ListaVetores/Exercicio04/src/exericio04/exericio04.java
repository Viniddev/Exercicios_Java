package exericio04;
import java.util.Scanner;

public class exericio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float vetor[] = new float[8];
		int posi1 = 0, posi2 = 0;
		float soma = 0;
		
		for(int n = 0; n < 8; n++) {
			System.out.printf("Digite um valor para a posição %d: ", n);
			vetor[n] = sc.nextFloat();
			
		}
		
		System.out.println("------------------------------------------------------");
		
		System.out.print("Digite uma posição do vetor: ");
		posi1 = sc.nextInt();
		
		if(posi1 > vetor.length || posi1 < 0) {
			while(posi1 < 0 || posi1 > vetor.length) {
				System.out.print("\nDigite uma posição do vetor válida: ");
				posi1 = sc.nextInt();
			}
		}
		
		System.out.print("Digite uma segunda posição do vetor: ");
		posi2 = sc.nextInt();
		
		if(posi2 > vetor.length || posi2 < 0) {
			while(posi2 < 0 || posi2 > vetor.length) {
				System.out.print("\nDigite uma posição do vetor válida válida: ");
				posi2= sc.nextInt();
			}
		}
		
		System.out.println("------------------------------------------------------");
		
		soma = vetor[posi1] + vetor[posi2];
		
		System.out.printf("A soma dos elementos na posição %d e %d é igual a: %.2f", posi1, posi2, soma);
		
	}
}
