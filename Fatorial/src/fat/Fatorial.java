package fat;
import java.lang.Math;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		int fim = 1;
		
		System.out.println("Vamos realizar o fatorial de um número!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual número deseja relizar o fat? ");
		int fat = sc.nextInt();
		
		for(int n=1; n <= fat; n++){
			if (n<fat) {
				System.out.print(n + " x ");
			}else {
				System.out.print(n + " = ");
			}
			fim = fim*n;
		}
		System.out.print(fim);
	}
}
