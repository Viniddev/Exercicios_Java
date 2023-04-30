package tabelaV4;
import java.util.Scanner;

public class TabelaV4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int tabuada = 0;
		
		System.out.print("Deseja ver a tabuada de qual número: ");
		tabuada = sc.nextInt();
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			if(( i*tabuada) % 2 != 0) {
				System.out.printf("%d x %d = %d \n",tabuada, i, (tabuada * i));
			}
			else{
				continue;
			}
		}
	}
}
