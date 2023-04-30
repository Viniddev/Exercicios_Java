package aritmética;
import java.util.Scanner;

public class Aritmética {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float razao = 0, inicial = 0, ultimo = 0;
		int termos = 0;
		
		System.out.print("Digite o A1: ");
		inicial = sc.nextFloat();
		System.out.print("Digite Quantos termos terá a PA: ");
		termos = sc.nextInt();
		System.out.print("Digite a Razão: ");
		razao = sc.nextFloat();
		System.out.println("");
		
		ultimo = inicial + (termos-1) * razao;
		
		//Decrescente
		if(inicial > ultimo) {
			for(float i = inicial; i >= ultimo; i = i + razao) {
				if(i > ultimo) {
					System.out.print(i + " --> ");
				}else{
					System.out.print(i + ". ");
				}
			}
		//Crescente
		}else if(inicial < ultimo) {
			for(float i = inicial; i <= ultimo; i = i + razao) {
				if(i <  ultimo) {
					System.out.print(i + " --> ");
				}else{
					System.out.print(i + ". ");
				}
			}
		}
	}
}
