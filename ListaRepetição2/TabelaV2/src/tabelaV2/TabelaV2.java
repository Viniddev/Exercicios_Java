package tabelaV2;
import java.util.Scanner;

public class TabelaV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabuada = 0, inicio = 0, fim = 0;

		System.out.print("Deseja ver a tabuada de qual número: ");
		tabuada = sc.nextInt();
		System.out.print("Digite o inicio: ");
		inicio = sc.nextInt();
		System.out.print("Digite o fim: ");
		fim = sc.nextInt();
		
		System.out.println("");
		
		for(int i = inicio; i <= fim; i++) {
			System.out.printf("%d x %d = %d \n",tabuada, i, (tabuada * i));
		}
	}
}
