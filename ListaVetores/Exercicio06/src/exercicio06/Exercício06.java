package exercicio06;
import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float vetor[] = new float[10];
		float maior = 0, menor = 0;
		
		for(int n = 0; n < 10; n++) {
			System.out.printf("Digite um valor para a posição %d: ", n);
			vetor[n] = sc.nextFloat();
			
			if(n == 0) {
				maior = vetor[n];
				menor = vetor[n];
			}
			
			if(vetor[n] > maior) {
				maior = vetor[n];
			}else if(vetor[n] < menor) {
				menor = vetor[n];
			}
			
			
		}
		System.out.println("------------------------------------------------------");
		System.out.printf("Dado o vetor, temos que o maior número é %.2f e o menor é %.2f", maior, menor);
	}

}
